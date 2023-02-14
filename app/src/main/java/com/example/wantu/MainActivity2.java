package com.example.wantu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    private Spinner mSpinner1;
    private Spinner mSpinner2;
    private Spinner mSpinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String [] 위치모음 = {"음식점 위치를 선택하세요!","흥업","단구","무실","위치","모두"};
        final String [] 가격모음 = {"음식 가격을 선택하세요!","3000","6000","9000","free"};   // 0, 4 = string  나머지는 int
        final String [] 종류모음 = {"음식 종류를 선택하세요!","한식","중식","일식","모두","2"}; //논의후 결정

        //Spinner를 사용하여 클릭으로 선택할 수 있도록 구현
        final Spinner mSpinner1 = (Spinner) findViewById(R.id.spinner1) ;
        final Spinner mSpinner2 = (Spinner) findViewById(R.id.spinner2) ;
        final Spinner mSpinner3 = (Spinner) findViewById(R.id.spinner3) ;

        ArrayAdapter adapter1 = new ArrayAdapter(getApplicationContext(), R.layout.spinner_item, 위치모음); // 데이터
        mSpinner1.setAdapter(adapter1);
        ArrayAdapter adapter2 = new ArrayAdapter(getApplicationContext(), R.layout.spinner_item, 가격모음); // 데이터
        mSpinner2.setAdapter(adapter2);
        ArrayAdapter adapter3 = new ArrayAdapter(getApplicationContext(), R.layout.spinner_item, 종류모음); // 데이터
        mSpinner3.setAdapter(adapter3);


        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        mSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}

        });

        mSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>   parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });



        Button button=findViewById(R.id.Recommend_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity2.this, MainActivity3_list.class);

                Spinner spinner = (Spinner)findViewById(R.id.spinner1);
                String text = spinner.getSelectedItem().toString();
                intent2.putExtra("wheres", text);

                int a = 0;
                Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
                String text2 = spinner2.getSelectedItem().toString();
                if ("free".equals(text2) ) a=1;
                intent2.putExtra("moneys", text2);
                intent2.putExtra("money_s", a);



                Spinner spinner1 = (Spinner)findViewById(R.id.spinner3);
                String text1 = spinner1.getSelectedItem().toString();
                intent2.putExtra("cases", text1);

                startActivity(intent2);
            }
        });
    }
}