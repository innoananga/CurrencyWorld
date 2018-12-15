package com.maxzdanchuk.currencyworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<State> currencies = new ArrayList<>();

    ListView currencyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Приветствие в виде toast
        String welcome = getResources().getString(R.string.welcome);
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_SHORT).show();
        // Начальная инициализация списка
        setInitialData();
        // Получаем элемент ListView
        currencyList = (ListView) findViewById(R.id.currencyList);
        // Создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.currencies_list_item, currencies);
        // Устанавливаем адаптер
        currencyList.setAdapter(stateAdapter);
        // Слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Получаем выбранный пункт
                State selectedState = (State) parent.getItemAtPosition(position);
                // Создание объекта Intent для запуска YearsActivity
                Intent intent = new Intent(getApplicationContext(), YearsActivity.class);
                // Передача объекта
                intent.putExtra("Name", selectedState.getName().toLowerCase());
                // Запуск SecondActivity
                startActivity(intent);
            }
        };
        currencyList.setOnItemClickListener(itemListener);
    }

    private void setInitialData(){
        currencies.add(new State ("USD", R.drawable.unitedstates));
        currencies.add(new State ("EUR", R.drawable.europeanunion));
        currencies.add(new State ("RUB", R.drawable.russia));
    }

}
