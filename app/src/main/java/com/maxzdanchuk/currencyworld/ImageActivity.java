package com.maxzdanchuk.currencyworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    private static final String TAG = "ImageActivity";

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
