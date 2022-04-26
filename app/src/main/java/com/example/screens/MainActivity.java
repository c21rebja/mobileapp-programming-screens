package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("===", "Main activity resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("===", "Main activity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("===", "Main activity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("===", "Main activity destroyed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("===", "Main activity created.");
    }
}
