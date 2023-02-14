package com.example.wantu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainActivity_DB_eat extends SQLiteOpenHelper {
    public MainActivity_DB_eat(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {

        String eat = "CREATE TABLE if not exists eattable ( _id integer primary key autoincrement,음식 text, 가게 text, 가격 integer);";
        //여기다 넣으시고 실행시킨다음에 다시 삭제하시고 다시 실행해주세요
        db2.execSQL(eat);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        String eat = "DROP TABLE if exists eattable";

        db2.execSQL(eat);
        onCreate(db2);
    }

}