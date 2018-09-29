package com.example.headg.locationandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String value = intent.getStringExtra(Constants.KEY);
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: ");


    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.d(TAG, "onStart: ");
    }
    @Override
    protected  void onResume(){
        super.onResume();

        Log.d(TAG, "onResume: ");
    }

    @Override
    protected  void onPause(){
        super.onPause();

        Log.d(TAG, "onPause: ");
    }

    @Override
    protected  void onStop(){
        super.onStop();

        Log.d(TAG, "onStop: ");
    }
}
