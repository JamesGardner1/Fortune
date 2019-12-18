package com.example.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestartActivity extends AppCompatActivity {

    TextView diedText;
    Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restart);

        diedText = findViewById(R.id.you_died_text);
        restartButton = findViewById(R.id.restart_button);

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });


    }

    public void newGame() {
        Intent newGame = new Intent(RestartActivity.this, MainActivity.class);
        startActivity(newGame);
    }
}
