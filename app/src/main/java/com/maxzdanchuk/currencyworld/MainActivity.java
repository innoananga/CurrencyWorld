package com.maxzdanchuk.currencyworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Набор данных, которые свяжем со списком
    String[] currencies = { "USD", "EUR", "RUB", "UAH", "GBP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элемент ListView
        ListView countriesList = (ListView) findViewById(R.id.currencyList);

        // Создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currencies);

        // Устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
}
