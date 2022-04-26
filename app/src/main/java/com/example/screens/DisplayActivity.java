package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("===", "Display activity resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("===", "Display activity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("===", "Display activity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("===", "Display activity destroyed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Log.d("===", "Display activity created.");
    }
}