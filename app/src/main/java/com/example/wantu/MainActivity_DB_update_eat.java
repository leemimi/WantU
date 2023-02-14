package com.example.wantu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainActivity_DB_update_eat extends SQLiteOpenHelper {
    public MainActivity_DB_update_eat(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {

        String eat = "CREATE TABLE if not exists eattable ( _id integer primary key autoincrement,음식 text, 가게 text, 가격 integer);";
        //여기다 넣으시고 실행시킨다음에 다시 삭제하시고 다시 실행해주세요
        db2.execSQL(eat);
        eat = "delete from eattable; ";
        db2.execSQL(eat);
        eat = "DELETE FROM 'sqlite_sequence' WHERE name = 'eattable'";
        db2.execSQL(eat);


        eat = "INSERT INTO eattable('음식', '가게', '가격') values('순대국밥' ,'권순대', 7000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('얼큰순대국밥' ,'권순대', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('모듬순대' ,'권순대', 13000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('치킨마요' ,'한솥', 3500);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('새치고기고기' ,'한솥', 6000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('숯불직화구이' ,'한솥', 6500);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('우렁쌈밥' ,'우렁각시쌈밥', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('닭볶음탕' ,'우렁각시쌈밥', 30000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('김치_청국장 찌개' ,'우렁각시쌈밥', 7000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('짜장면' ,'금룡', 6000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('삼선짬뽕' ,'금룡', 9000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('삼선우동' ,'금룡', 9000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('오향장육' ,'흥업반점', 35000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('해파리냉채' ,'흥업반점', 30000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('유산슬밥' ,'흥업반점', 12000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('군만두' ,'처갓집손짜장', 5000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('탕수육' ,'처갓집손짜장', 25000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('라조기' ,'처갓집손짜장', 30000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('생등심돈까스' ,'필돈까스', 6000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('우동' ,'필돈까스', 3000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('고추까스' ,'필돈까스', 7000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('새우초밥' ,'필초밥', 1000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('연어초밥' ,'필초밥', 1200);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('오코노미야키' ,'필초밥', 12000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('덴뿌라' ,'필튀김', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('나가소멘' ,'필튀김', 7500);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('오차즈케' ,'필튀김', 20000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('추어탕' ,'원주복추어탕', 11000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('미꾸라지 튀김' ,'원주복추어탕', 13000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('추어탕' ,'원주복추어탕', 9000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('곤드레보쌈게장정식' ,'칡산에', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('옹심이칡막국수' ,'칡산에', 6500);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('칡물냉면' ,'칡산에', 5500);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('삼계탕' ,'길성이', 15000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('메밀전병' ,'길성이', 12000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('쟁반막국수' ,'길성이', 7000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('황후짜장' ,'장금성중화요리', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('황제짬뽕' ,'장금성중화요리', 16000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('삼선볶음밥' ,'장금성중화요리', 8000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('자스민 정식류' ,'자스민', 20000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('삼선해물짬뽕' ,'자스민', 6000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('점심특선' ,'자스민', 10000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('꼬막짬뽕' ,'예지현', 9000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('꼬막짜장' ,'예지현', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('꼬막탕수육' ,'예지현', 30000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('아나고동' ,'스시노백쉐프', 11000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('타코와사비밥' ,'스시노백쉐프', 6000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('와규스테이크라인' ,'스시노백쉐프', 39800);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('딱새우회' ,'술가락', 20000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('곱창나베' ,'술가락', 18000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('명란오믈렛' ,'술가락', 8000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('규동' ,'방식당', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('야키소바' ,'방식당', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('치킨 가라아게' ,'방식당', 15000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('부대찌개' ,'돌집부대찌개', 7000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('섞어찌개 튀김' ,'돌집부대찌개', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('사리추가' ,'돌집부대찌개', 2000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('말이고기' ,'산정집', 2100);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('내장볶음' ,'산정집', 23000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('된장찌개' ,'산정집', 2000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('알탕' ,'까치둥지', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('알추가' ,'까치둥지', 8000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('곤이추가' ,'까치둥지', 7000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('칠리새우' ,'영화은마차', 22000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('양장피' ,'영화은마차', 16000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('고추잡채' ,'영화은마차', 25000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('디너코스 매' ,'린', 23000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('디너코스 난' ,'린',33000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('디너코스 국' ,'린', 40000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('수제탕수육' ,'찰로윈', 13000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('단무지' ,'찰로윈', 500);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('춘장양파' ,'찰로윈', 400);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('알탕' ,'혁신수산', 7000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('멍개+개불' ,'혁신수산', 30000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('광어+우럭' ,'혁신수산', 45000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('텐동' ,'오전한시', 10000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('장어덮밥' ,'오전한시', 12000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('차슈덮밥' ,'오전한시', 8000);";
        db2.execSQL(eat);

        eat = "INSERT INTO eattable('음식', '가게', '가격') values('아오야마카레' ,'아오야마식당', 7500);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('카레추가' ,'아오야마식당', 3000);";
        db2.execSQL(eat);
        eat = "INSERT INTO eattable('음식', '가게', '가격') values('수제피클' ,'아오야마식당', 1500);";
        db2.execSQL(eat);













    }


    @Override
    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        String eat = "DROP TABLE if exists eattable";

        db2.execSQL(eat);
        onCreate(db2);
    }

}