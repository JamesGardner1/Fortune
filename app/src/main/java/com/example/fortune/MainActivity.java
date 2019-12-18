package com.example.fortune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton card1, card2, card3;
    TextView stageText, levelText, healthText, xpText, goldText, goldValue;
    ImageView healthBar, xpBar;

    Random r = new Random();

    Creature bigCreature = new Creature(10, 25, 30, 25, 25);
    Creature elite = new Creature(15, 30, 60, 50, 0);
    Creature smallCreatue = new Creature(5, 15, 15, 15, 0);
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


        // Initial Stats
        setPlayerStats();
        // Pulls in base set of cards
        baseCards();


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

    public void pickFortune1() {
        Drawable.ConstantState bigCreatureConstantState = getResources().getDrawable(R.drawable.bigcreature).getConstantState();
        Drawable.ConstantState goldConstantState = getResources().getDrawable(R.drawable.gold).getConstantState();
        Drawable.ConstantState eliteConstantState = getResources().getDrawable(R.drawable.elite).getConstantState();
        Drawable.ConstantState healConstantState = getResources().getDrawable(R.drawable.heal).getConstantState();
        Drawable.ConstantState mysteryConstantState = getResources().getDrawable(R.drawable.mystery).getConstantState();
        Drawable.ConstantState shopConstantState = getResources().getDrawable(R.drawable.shop).getConstantState();
        Drawable.ConstantState smallCreatureConstantState = getResources().getDrawable(R.drawable.smallcreatures).getConstantState();
        if (card1.getDrawable().getConstantState().equals(bigCreatureConstantState)) {
            bigCreature();
        } else if (card1.getDrawable().getConstantState().equals(goldConstantState)) {
            player.gold = player.gold + 100;
            setStatsInterface();
        } else if (card1.getDrawable().getConstantState().equals(eliteConstantState)) {
            eliteBattle();
        } else if (card1.getDrawable().getConstantState().equals(healConstantState)) {
            player.hp = player.hp + 35;
            checkUpdates();
            shuffleDraw();
        } else if (card1.getDrawable().getConstantState().equals(mysteryConstantState)) {
            mysterySelection();
        } else if (card1.getDrawable().getConstantState().equals(shopConstantState)) {
            shop();
        } else if (card1.getDrawable().getConstantState().equals(smallCreatureConstantState)) {
            smallCreature();
        } else {
            Toast.makeText(MainActivity.this, "Error! Please Restart Application", Toast.LENGTH_LONG);
        }
    }

    public void pickFortune2() {
        Drawable.ConstantState bigCreatureConstantState = getResources().getDrawable(R.drawable.bigcreature).getConstantState();
        Drawable.ConstantState goldConstantState = getResources().getDrawable(R.drawable.gold).getConstantState();
        Drawable.ConstantState eliteConstantState = getResources().getDrawable(R.drawable.elite).getConstantState();
        Drawable.ConstantState healConstantState = getResources().getDrawable(R.drawable.heal).getConstantState();
        Drawable.ConstantState mysteryConstantState = getResources().getDrawable(R.drawable.mystery).getConstantState();
        Drawable.ConstantState shopConstantState = getResources().getDrawable(R.drawable.shop).getConstantState();
        Drawable.ConstantState smallCreatureConstantState = getResources().getDrawable(R.drawable.smallcreatures).getConstantState();
        if (card2.getDrawable().getConstantState().equals(bigCreatureConstantState)) {
            bigCreature();
        } else if (card2.getDrawable().getConstantState().equals(goldConstantState)) {
            player.gold = player.gold + 100;
            setStatsInterface();
            shuffleDraw();
        } else if (card2.getDrawable().getConstantState().equals(eliteConstantState)) {
            eliteBattle();
        } else if (card2.getDrawable().getConstantState().equals(healConstantState)) {
            player.hp = player.hp + 35;
            checkUpdates();
            shuffleDraw();
        } else if (card2.getDrawable().getConstantState().equals(mysteryConstantState)) {
            mysterySelection();
        } else if (card2.getDrawable().getConstantState().equals(shopConstantState)) {
            shop();
        } else if (card2.getDrawable().getConstantState().equals(smallCreatureConstantState)) {
            smallCreature();
        } else {
            Toast.makeText(MainActivity.this, "Error! Please Restart Application", Toast.LENGTH_LONG);
        }
    }

    public void pickFortune3() {
        Drawable.ConstantState bigCreatureConstantState = getResources().getDrawable(R.drawable.bigcreature).getConstantState();
        Drawable.ConstantState goldConstantState = getResources().getDrawable(R.drawable.gold).getConstantState();
        Drawable.ConstantState eliteConstantState = getResources().getDrawable(R.drawable.elite).getConstantState();
        Drawable.ConstantState healConstantState = getResources().getDrawable(R.drawable.heal).getConstantState();
        Drawable.ConstantState mysteryConstantState = getResources().getDrawable(R.drawable.mystery).getConstantState();
        Drawable.ConstantState shopConstantState = getResources().getDrawable(R.drawable.shop).getConstantState();
        Drawable.ConstantState smallCreatureConstantState = getResources().getDrawable(R.drawable.smallcreatures).getConstantState();
        if (card3.getDrawable().getConstantState().equals(bigCreatureConstantState)) {
            bigCreature();
        } else if (card3.getDrawable().getConstantState().equals(goldConstantState)) {
            player.gold = player.gold + 100;
            setStatsInterface();
            Toast.makeText(MainActivity.this, "Gained 100 gold", Toast.LENGTH_SHORT).show();
            shuffleDraw();
        } else if (card3.getDrawable().getConstantState().equals(eliteConstantState)) {
            eliteBattle();
        } else if (card3.getDrawable().getConstantState().equals(healConstantState)) {
            player.hp = player.hp + 35;
            checkUpdates();
            shuffleDraw();
        } else if (card3.getDrawable().getConstantState().equals(mysteryConstantState)) {
            mysterySelection();
        } else if (card3.getDrawable().getConstantState().equals(shopConstantState)) {
            shop();
        } else if (card3.getDrawable().getConstantState().equals(smallCreatureConstantState)) {
            smallCreature();
        } else {
            Toast.makeText(MainActivity.this, "Error! Please Restart Application", Toast.LENGTH_LONG).show();
        }
    }

    public void bigCreature() {
        int damage = r.nextInt((bigCreature.maxDamage - bigCreature.minDamage) + 1) + bigCreature.minDamage;
        player.hp = player.hp - damage;
        player.xp = player.xp + bigCreature.xp;
        player.gold = player.gold + bigCreature.gold;

        Toast.makeText(MainActivity.this, "Lost " + damage + " health! Gained " + bigCreature.gold + " gold and" + bigCreature.xp + " experience!", Toast.LENGTH_LONG).show();
        setStatsInterface();
        checkUpdates();
        shuffleDraw();

    }



    public void eliteBattle() {
        int damage = r.nextInt((elite.maxDamage - elite.minDamage) + 1) + elite.minDamage;
        player.hp = player.hp - damage;
        player.xp = player.xp + elite.xp;
        player.gold = player.gold + elite.gold;

        Toast.makeText(MainActivity.this, "Lost " + damage + " health! Gained " + elite.gold + " gold and" + elite.xp + " experience!", Toast.LENGTH_LONG).show();
        setStatsInterface();
        checkUpdates();
        shuffleDraw();
    }

    public void mysterySelection() {
        int mysteryPick = r.nextInt(5) + 1;

        if (mysteryPick == 1) {
            Toast.makeText(MainActivity.this, "Big Creature!", Toast.LENGTH_SHORT).show();
            bigCreature();
        } else if (mysteryPick == 2) {
            Toast.makeText(MainActivity.this, "Elite!", Toast.LENGTH_SHORT).show();
            eliteBattle();
        } else if (mysteryPick == 3) {
            Toast.makeText(MainActivity.this, "Gold!", Toast.LENGTH_SHORT).show();
            player.gold = player.gold + 100;
            setStatsInterface();
            shuffleDraw();
        } else if (mysteryPick == 4) {
            Toast.makeText(MainActivity.this, "Heal!", Toast.LENGTH_SHORT).show();
            player.hp = player.hp + 35;
            checkUpdates();
            shuffleDraw();
        } else if (mysteryPick == 5) {
            Toast.makeText(MainActivity.this, "Shop!", Toast.LENGTH_SHORT).show();
            shop();
        } else  {
            Toast.makeText(MainActivity.this, "Small Creature!", Toast.LENGTH_SHORT).show();
            smallCreature();
        }
    }

    public void shop() {
        Intent shop = new Intent(MainActivity.this, ShopActivity.class);
        startActivity(shop);
        shuffleDraw();

    }


    public void smallCreature() {
        int damage = r.nextInt((elite.maxDamage - elite.minDamage) + 1) + elite.minDamage;
        player.hp = player.hp - damage;
        player.xp = player.xp + elite.xp;
        player.gold = player.gold + elite.gold;

        Toast.makeText(MainActivity.this, "Lost " + damage + " health! Gained " + elite.gold + " gold and" + elite.xp + " experience!", Toast.LENGTH_LONG).show();
        setStatsInterface();
        checkUpdates();
        shuffleDraw();
    }

    public void setStatsInterface() {
        goldValue.setText(player.gold + "");

    }

    // Base set of Cards

    public void baseCards() {
        card1.setImageResource(R.drawable.bigcreature);
        card2.setImageResource(R.drawable.smallcreatures);
        card3.setImageResource(R.drawable.gold);
    }

    // Pull up random set of cards

    public void shuffleDraw() {
        int set = r.nextInt(3) + 1;

        if (set == 1) {
            set2();
        } else if (set == 2) {
            set3();
        } else if (set == 3) {
            set4();
        } else  {
            set5();
        }
    }

    public void set2() {
        card1.setImageResource(R.drawable.smallcreatures);
        card2.setImageResource(R.drawable.mystery);
        card3.setImageResource(R.drawable.heal);
    }

    public void set3() {
        card1.setImageResource(R.drawable.shop);
        card2.setImageResource(R.drawable.elite);
        card3.setImageResource(R.drawable.bigcreature);
    }

    public void set4() {
        card1.setImageResource(R.drawable.mystery);
        card2.setImageResource(R.drawable.shop);
        card3.setImageResource(R.drawable.elite);
    }

    public void set5() {
        card1.setImageResource(R.drawable.heal);
        card2.setImageResource(R.drawable.gold);
        card3.setImageResource(R.drawable.smallcreatures);
    }

    public void checkUpdates() {
        if (player.xp > 60 && player.xp < 1000) {
            levelText.setText("Level 2");
            xpBar.setImageResource(R.drawable.xp0);
        }

        if (player.hp >= 100) {
            healthBar.setImageResource(R.drawable.fullhealth);
        } else if (player.hp < 100 && player.hp > 70) {
            healthBar.setImageResource(R.drawable.health75);
        } else if (player.hp <= 70 && player.hp > 45) {
            healthBar.setImageResource(R.drawable.health50);
        } else if (player.hp <= 44 && player.hp < 0) {
            healthBar.setImageResource(R.drawable.health25);
        } else {
            restartGame();
        }

        if (player.xp == 0) {
            xpBar.setImageResource(R.drawable.xp0);
        } else if (player.xp > 0 && player.xp < 15) {
            xpBar.setImageResource(R.drawable.xp10);
        } else if (player.xp >= 15 && player.xp < 30) {
            xpBar.setImageResource(R.drawable.xp30);
        } else if (player.xp >= 30 && player.xp < 60) {
            xpBar.setImageResource(R.drawable.xp40);
        }
    }

    public void restartGame() {

    }



}