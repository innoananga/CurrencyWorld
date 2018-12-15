package com.maxzdanchuk.currencyworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class YearsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.get("Name").toString();
            Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
        }
    }
}
