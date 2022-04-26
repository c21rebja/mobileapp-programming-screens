package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textbox1;
    private EditText textbox2;
    private EditText textbox3;

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

        Button sumbitBtn = findViewById(R.id.main_submitbutton);
        textbox1 = findViewById(R.id.main_word1);
        textbox2 = findViewById(R.id.main_word2);
        textbox3 = findViewById(R.id.main_word3);

        sumbitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===", "Button has been clicked!");
                Log.d("===", "Word 1 is: " + textbox1.getText().toString());
                Log.d("===", "Word 2 is: " + textbox2.getText().toString());
                Log.d("===", "Word 3 is: " + textbox3.getText().toString());

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("text1", textbox1.getText().toString());
                intent.putExtra("text2", textbox2.getText().toString());
                intent.putExtra("text3", textbox3.getText().toString());
                startActivity(intent);
            }
        });
    }
}
