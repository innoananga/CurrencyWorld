package com.maxzdanchuk.currencyworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class YearsActivity extends AppCompatActivity {

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
    }
}
