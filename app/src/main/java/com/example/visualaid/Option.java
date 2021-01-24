package com.example.visualaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        final ImageButton tutorialButton = (ImageButton) findViewById(R.id.toTutorial);
        final ImageButton quizButton = (ImageButton) findViewById(R.id.toQuiz);
        final ImageButton gameButton = (ImageButton) findViewById(R.id.toGame);

        tutorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Option.this, DashboardActivity.class));
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Option.this, quiz.class));
            }
        });

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(Option.this, DashboardActivity.class));
            }
        });
    }
}