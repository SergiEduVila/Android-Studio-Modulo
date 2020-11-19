package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String LOG_TAG="SIKES";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"-----");
        Log.d(LOG_TAG,"onCreate");
    }

    public void Act2On(View v){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,1);
    }

    public void onClick(View v){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,1);
    }


    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart: ");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }
}