package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView animalBox;
    private TextView flavourBox;
    private TextView colourBox;

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

        animalBox = findViewById(R.id.displaybox_1);
        colourBox = findViewById(R.id.displaybox_3);
        flavourBox = findViewById(R.id.displaybox_2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String colourText = extras.getString("text1");
        String animalText = extras.getString("text2");
        String flavourText = extras.getString("text3");

        animalBox.setText(animalText);
        colourBox.setText(colourText);
        flavourBox.setText(flavourText);
    }
}