package com.example.fortune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton card1, card2, card3;
    TextView stageText, levelText, healthText, xpText;
    ProgressBar healthBar, xpBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPlayerStats();

        card1 = findViewById(R.id.card_button_1);
        card2 = findViewById(R.id.card_button_2);
        card3 = findViewById(R.id.card_button_3);
        stageText = findViewById(R.id.stage_text);
        levelText = findViewById(R.id.level_text);
        healthText = findViewById(R.id.health_text);
        xpText = findViewById(R.id.xp_text);
        healthBar = findViewById(R.id.health_bar);
        xpBar = findViewById(R.id.xp_bar);





    }

    public void setPlayerStats() {
        healthBar.setMax(100);
        healthBar.setProgress(100);
        xpBar.setMax(60);
        xpBar.setProgress(0);
    }
}
