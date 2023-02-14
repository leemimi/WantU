package com.example.wantu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainActivity_DB_update extends SQLiteOpenHelper {
    public MainActivity_DB_update(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // DB 값을 집어 넣는 코드
        // values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.sundae+""); <-- uri로 이미지를 경로를 설정하여 넣는 방법
        //String sql = "CREATE TABLE if not exists mytable ( _id integer primary key autoincrement, txt text, uri text);";
        String sql = "CREATE TABLE if not exists mytable ( _id integer primary key autoincrement,txt text, uri text,위치 text, 번호 text ,종류 text);";
        db.execSQL(sql);
        sql = "delete from mytable; ";
        db.execSQL(sql);
        sql = "DELETE FROM 'sqlite_sequence' WHERE name = 'mytable'";
        db.execSQL(sql);

        ContentValues values = new ContentValues();

        String sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('권순대' ,'흥업', '033-765-3411','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.sundae+"");
        db.update("mytable",values,"txt=?", new String[]{"권순대"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('한솥' ,'흥업', '033-766-8776','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.hansot+"");
        db.update("mytable",values,"txt=?", new String[]{"한솥"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('우렁각시쌈밥' ,'흥업', '033-762-7626','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.ssam+"");
        db.update("mytable",values,"txt=?", new String[]{"우렁각시쌈밥"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('금룡' ,'흥업', '033-763-5690','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.guem+"");
        db.update("mytable",values,"txt=?", new String[]{"금룡"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('흥업반점' ,'흥업', '033-763-4145','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.heng+"");
        db.update("mytable",values,"txt=?", new String[]{"흥업반점"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('처갓집손짜장' ,'흥업', '033-763-4801','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.chugot+"");
        db.update("mytable",values,"txt=?", new String[]{"처갓집손짜장"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('필돈까스' ,'흥업', '033-762-2229','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.feel+"");
        db.update("mytable",values,"txt=?", new String[]{"필돈까스"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('필초밥' ,'흥업', '033-762-2230','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.feel2+"");
        db.update("mytable",values,"txt=?", new String[]{"필초밥"});


         sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('필튀김' ,'흥업', '033-762-2231','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.feel3+"");
        db.update("mytable",values,"txt=?", new String[]{"필튀김"});

        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('원주복추어탕' ,'무실', '033-762-7989','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.chuwa+"");
        db.update("mytable",values,"txt=?", new String[]{"원주복추어탕"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('길성이' ,'무실', '033-734-7773','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.gilsung+"");
        db.update("mytable",values,"txt=?", new String[]{"길성이"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('칡산에' ,'무실', '033-742-0210','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.chig+"");
        db.update("mytable",values,"txt=?", new String[]{"칡산에"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('장금성중화요리' ,'무실', '033-765-1267','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.jang+"");
        db.update("mytable",values,"txt=?", new String[]{"장금성중화요리"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('자스민' ,'무실', '033-743-3370','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.jasmin+"");
        db.update("mytable",values,"txt=?", new String[]{"자스민"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('예지현' ,'무실', '033-764-7294','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.yezi+"");
        db.update("mytable",values,"txt=?", new String[]{"예지현"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('스시노백쉐프' ,'무실', '033-733-5802','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.susino+"");
        db.update("mytable",values,"txt=?", new String[]{"스시노백쉐프"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('술가락' ,'무실', '033-9169-4489','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.sul+"");
        db.update("mytable",values,"txt=?", new String[]{"술가락"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('방식당' ,'무실', '033-762-2229','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.bang+"");
        db.update("mytable",values,"txt=?", new String[]{"방식당"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('돌집부대찌개' ,'단구동', '033-764-3337','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.budae+"");
        db.update("mytable",values,"txt=?", new String[]{"돌집부대찌개"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('산정집' ,'단구', '033-742-8556','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.sanjung+"");
        db.update("mytable",values,"txt=?", new String[]{"산정집"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('까치둥지' ,'단구', '033-761-8008','한식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.ggachi+"");
        db.update("mytable",values,"txt=?", new String[]{"까치둥지"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('영화은마차' ,'단구', '033-765-1267','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.young+"");
        db.update("mytable",values,"txt=?", new String[]{"영화은마차"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('린' ,'단구', '033-748-9977','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.lin+"");
        db.update("mytable",values,"txt=?", new String[]{"린"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('찰로원' ,'단구', '033-764-7294','중식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.chal+"");
        db.update("mytable",values,"txt=?", new String[]{"찰로원"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('혁신수산' ,'단구', '033-747-9010','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.hyuc+"");
        db.update("mytable",values,"txt=?", new String[]{"혁신수산"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('오전한시' ,'단구', '033-9169-4489','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.ojun+"");
        db.update("mytable",values,"txt=?", new String[]{"오전한시"});


        sql1 = "INSERT INTO mytable('txt', '위치', '번호' ,'종류') values('아오야마식당' ,'단구', '033-762-2229','일식');";
        db.execSQL(sql1);
        values.put("uri","android.resource://"+ R.class.getPackage().getName()+"/"+R.drawable.aoyama+"");
        db.update("mytable",values,"txt=?", new String[]{"아오야마식당"});




    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE if exists mytable";

        db.execSQL(sql);
        onCreate(db);
    }
}