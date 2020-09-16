package com.luthomas.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button clickButton; // button to connect to .xml button
    TextView displayMessage; // text to connect to .xml text
    int count = 0; // counting in onClick method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // added activities
        clickButton = findViewById(R.id.clicker);
        displayMessage = findViewById(R.id.greeting);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hi Dad!!");
                Log.i("clickResponse", "I love CS");
                displayMessage.setText(""+(++count));
            }
        });
    }

    public void reduce(View view) {
        displayMessage.setText(""+(--count));
    }
}