package com.example.wantu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        Button button_list=findViewById(R.id.button_list);
        button_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //데이터베이스를 업데이트 해주는 버튼 구현
                MainActivity_DB_update helper;
                final SQLiteDatabase db;
                helper = new MainActivity_DB_update(MainActivity.this, "newdb.db", null, 1);
                db = helper.getWritableDatabase();
                helper.onCreate(db);


                MainActivity_DB_update_eat helper2;
                final SQLiteDatabase db2;
                helper2 = new MainActivity_DB_update_eat(MainActivity.this, "eat.db", null, 1);
                db2 = helper2.getWritableDatabase();
                helper2.onCreate(db2);

                Toast.makeText(getApplicationContext(), "데이터를 불러옵니다.",Toast.LENGTH_LONG).show();

            }
        });


        }
    }