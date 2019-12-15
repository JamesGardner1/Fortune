package com.example.fortune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton card1, card2, card3;
    TextView stageText, levelText, healthText, xpText, goldText, goldValue;
    ProgressBar healthBar, xpBar;

    Random r = new Random();

    Creature bigCreature = new Creature(10, 25, 30, 25, 25);
    Player player = new Player(100, 0, 100, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.card_button_1);
        card2 = findViewById(R.id.card_button_2);
        card3 = findViewById(R.id.card_button_3);
        stageText = findViewById(R.id.stage_text);
        levelText = findViewById(R.id.level_text);
        healthText = findViewById(R.id.health_text);
        xpText = findViewById(R.id.xp_text);
        goldText = findViewById(R.id.gold_text);
        goldValue = findViewById(R.id.gold_value);
        healthBar = findViewById(R.id.health_bar);
        xpBar = findViewById(R.id.xp_bar);

        setPlayerStats();

        card1.setImageResource(R.drawable.bigcreature);
        card2.setImageResource(R.drawable.bigcreature);
        card2.setContentDescription(getResources().getString(R.string.big_creature));
        card3.setImageResource(R.drawable.bigcreature);
        card3.setContentDescription(getResources().getString(R.string.big_creature));

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickFortune1();
            }


        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickFortune2();
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickFortune3();
            }
        });


    }

    public void setPlayerStats() {
        player.hp = 100;
        player.xp = 0;
        player.gold = 0;
        player.fortune = 100;
    }

    public void setStatsInterface() {
        goldValue.setText(player.gold);

    }


    public void pickFortune1() {
        bigCreature();


    }

    public void pickFortune2() {
        if (card2.getContentDescription() == "@string/big_creature") {
            bigCreature();
        } else {
            Toast.makeText(MainActivity.this, "This isnt working", Toast.LENGTH_LONG).show();
        }

    }

    public void pickFortune3() {
        if (card3.getDrawable().equals(R.drawable.bigcreature)) {
            bigCreature();
        } else {
            Toast.makeText(MainActivity.this, "This isnt working", Toast.LENGTH_LONG).show();
        }

    }

    public void bigCreature() {
        int damage = r.nextInt((bigCreature.maxDamage = bigCreature.minDamage) + 1) + bigCreature.minDamage;
        if (player.fortune > bigCreature.survive) {
            player.hp = player.hp - damage;
            player.xp = player.xp + bigCreature.xp;
            player.gold = player.gold + bigCreature.gold;

            Toast.makeText(MainActivity.this, "Lost " + damage + " health! Gained " + bigCreature.gold + " gold and" + bigCreature.xp + " experience!", Toast.LENGTH_LONG).show();
            setStatsInterface();
        } else {
            unlucky();
        }
    }

    public void unlucky() {

    }
}