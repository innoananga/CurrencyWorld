package com.maxzdanchuk.currencyworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Bundle extras = getIntent().getExtras();
        String name = extras.get("Name").toString();
        String year = extras.get("Year").toString();

        imageView = (ImageView) findViewById(R.id.image);

        String mDrawableName = name + "_" + year;
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());

        imageView.setImageResource(resID);
    }
}
