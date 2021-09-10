package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity2 extends Activity {
    public static final String TAG = "StartActivity";
    private Integer count = 5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");

    }
    @Override
    public void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestart");
    }
    @Override
    public void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onResume");
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
    }
    @Override
    public void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPause");
    }
    @Override
    public void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy");
    }

}
