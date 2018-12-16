package com.maxzdanchuk.currencyworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class YearsActivity extends AppCompatActivity {

    private static final String TAG = "YearsActivity";

    ListView yearsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);

        yearsList = (ListView) findViewById(R.id.yearsList);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Получаем год
                String selectedYear = (String) parent.getItemAtPosition(position);
                // Получаем выбранную валюту
                Bundle extras = getIntent().getExtras();
                String name = extras.get("Name").toString();
                // Создание объекта Intent для запуска YearsActivity
                Intent intent = new Intent(getApplicationContext(), ImageActivity.class);
                // Передача объектов
                intent.putExtra("Name", name);
                intent.putExtra("Year", selectedYear);
                // Запуск ImageActivity
                startActivity(intent);
            }
        };
        yearsList.setOnItemClickListener(itemListener);

        Log.d(TAG, "Вызов onCreate");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Вызов onDestroy");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Вызов onStop");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Вызов onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Вызов onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Вызов onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "Вызов onRestart");
    }

    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Вызов onSaveInstanceState");
    }

    @Override
    protected  void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Вызов onRestoreInstanceState");
    }

}