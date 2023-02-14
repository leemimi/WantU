package com.example.wantu;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import android.provider.FontRequest;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity3_list extends AppCompatActivity {

    String[] permissions = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_layout);

        ActivityCompat.requestPermissions(MainActivity3_list.this, permissions,  1);

        ListView listView =(ListView)findViewById(R.id.listview);

        MainActivity_DB helper;
        final SQLiteDatabase db;
        helper = new MainActivity_DB(MainActivity3_list.this, "newdb.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);


        Intent intent = getIntent();
        String wheres = intent.getExtras().getString("wheres");
        String cases = intent.getExtras().getString("cases");
        final String moneys = intent.getExtras().getString("moneys");
        final int money_s = intent.getExtras().getInt("money_s");

        // Spinner에서 고른 값들을 조회하는 sql문을 작성하는 코드를 만드는 알고리즘

        String sql = "select * from mytable ";

        int n=0;

        if ("모두".equals(wheres)) { }
        else {
            if (n < 1) { sql = sql + " where "; n++; }
            sql = sql + " 위치 like '%" + wheres + "%' ";
        }

        if ("모두".equals(cases)) { }
        else {
            if (n < 1) { sql = sql + " where "; n++; }
            else if(n < 2) sql = sql + " AND ";
            sql = sql + " 종류='" + cases + "' ";
        }

        n=0;


        Cursor c = db.rawQuery(sql, null);

        //그림을 넣기 위해 uri형식을 이용 sql문에 그림을 넣을 수 없다.
        String[] strs = new String[]{"uri","txt"};
        int[] ints = new int[] {R.id.listview_img, R.id.listview_txt};


        MyCursorAdapter adapter = null;
        adapter = new MyCursorAdapter(listView.getContext(), R.layout.listview, c, strs, ints);

        listView.setAdapter(adapter);


        final MyCursorAdapter finalAdapter = adapter;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void  onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView text1 = (TextView) view.findViewById(R.id.listview_txt);


                Intent intent = new Intent(getApplicationContext(), MainActivity4_Detail.class);

                //가게를 선택하면 그 가게에 DB의 값들을 상세페이지로 전달하는 intent

                Cursor itemCursor = (Cursor) finalAdapter.getItem(position);
                String index1 = itemCursor.getString(itemCursor.getColumnIndex("_id"));
                String index2 = itemCursor.getString(itemCursor.getColumnIndex("txt"));
                String index3 = itemCursor.getString(itemCursor.getColumnIndex("uri"));
                String index4 = itemCursor.getString(itemCursor.getColumnIndex("위치"));
                String index5 = itemCursor.getString(itemCursor.getColumnIndex("번호"));
                String index6 = itemCursor.getString(itemCursor.getColumnIndex("종류"));
                //int number = Integer.parseInt(index);
                intent.putExtra("id_number", index1);
                intent.putExtra("txt_number", index2);
                intent.putExtra("uri_number", index3);
                intent.putExtra("위치_number", index4);
                intent.putExtra("번호_number", index5);
                intent.putExtra("종류_number", index6);
                intent.putExtra("moneys", moneys);
                intent.putExtra("money_s", money_s);
                //----------------


                startActivity(intent);

            }
        });
    }
}

