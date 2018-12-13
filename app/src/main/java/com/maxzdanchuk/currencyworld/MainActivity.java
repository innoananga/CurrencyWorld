package com.maxzdanchuk.currencyworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элемент ListView
        ListView currenciesList = (ListView) findViewById(R.id.currencyList);

        // Получаем ресурс
        String[] currencies = getResources().getStringArray(R.array.currencies);

        // Создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currencies);

        // Устанавливаем для списка адаптер
        currenciesList.setAdapter(adapter);
    }
}
