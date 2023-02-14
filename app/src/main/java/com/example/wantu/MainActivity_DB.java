package com.example.wantu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity_DB extends SQLiteOpenHelper {
        public MainActivity_DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //String sql = "CREATE TABLE if not exists mytable ( _id integer primary key autoincrement, txt text, uri text);";
            String sql = "CREATE TABLE if not exists mytable ( _id integer primary key autoincrement,txt text, uri text,위치 text, 번호 text ,종류 text);";
            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            String sql = "DROP TABLE if exists mytable";
            db.execSQL(sql);
            onCreate(db);
        }
}