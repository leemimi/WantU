package com.example.wantu;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity4_Detail extends Activity {
    String[] permissions = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_view);

        Intent intent = getIntent(); // 보내온 Intent를 얻는다
        String var1 = intent.getExtras().getString("id_number");
        String var2 = intent.getExtras().getString("txt_number");
        String var3 = intent.getExtras().getString("uri_number");
        Uri var4 = Uri.parse(var3);
        String var5 = intent.getExtras().getString("위치_number");
        String var6 = intent.getExtras().getString("번호_number");
        String var7 = intent.getExtras().getString("종류_number");
        String  moneys = intent.getExtras().getString("moneys");
        int money_s = intent.getExtras().getInt("money_s");

        TextView textView1 = (TextView)findViewById(R.id.textView_id);
        TextView textView2 = (TextView)findViewById(R.id.textView_detailed);
        ImageView imageView = (ImageView)findViewById(R.id.imageView_detailed);
        TextView textView4 = (TextView)findViewById(R.id.textView_위치);
        TextView textView5 = (TextView)findViewById(R.id.textView_번호);
        TextView textView6 = (TextView)findViewById(R.id.textView_종류);

        textView1.setText(var1);
        textView2.setText(var2);
        imageView.setImageURI(var4);
        textView4.setText(var5);
        textView5.setText(var6);
        textView6.setText(var7);


        //위까지 정상


        ListView listView_eat =(ListView)findViewById(R.id.listview_eat);
        MainActivity_DB_eat helper2;
        final SQLiteDatabase db2;
        helper2 = new MainActivity_DB_eat(MainActivity4_Detail.this, "eat.db", null, 1);
        db2 = helper2.getWritableDatabase();
        helper2.onCreate(db2);

        //앞 Spinner에서 음식가격 선택시 그 이하만 보여주는 spl문
        String eat = "select * from eattable ";
        if(money_s == 1) { eat = eat + " where 가게 ='" + var2+ "'; "; }
        else {
            eat = eat + " where 가격 <= "+ moneys +" and 가게 ='" + var2+ "'; ";
        }

        //실패
        // "select             * from eattable " WHERE EXISTS(SELECT eattable FROM 가게 WHERE 가게.eattable = mytable.txt)
        // SELECT DISTINCT 필드명 FROM 테이블명 WHERE EXISTS(SELECT 필드명 FROM 테이블명 WHERE 테이블명.필드명 = 테이블명.필드명)
        // eat = eat + " where 가격 <= "+ moneys +"
        //inner join mytable on eattable.가게 = mytable.txt

        Cursor c = db2.rawQuery(eat, null);
        String[] strs2 = new String[]{"음식","가격"};
        int[] ints = new int[] {R.id.listview_eat_이름, R.id.listview_eat_가격};
        MyCursorAdapter_eat adapter2 = null;
        adapter2 = new MyCursorAdapter_eat(listView_eat.getContext(), R.layout.listview_eat, c, strs2, ints);

        listView_eat.setAdapter(adapter2);
    }

} // end of onCreate


