package com.example.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {

    TextView goldText, potionText, prayerBeadsText, swordAndShieldText, expUpText, goldUpText, shopText;
    ImageView potion, prayerBeads, swordAndShield, expUpSkill, goldUpSkill;
    Button buyPotionButton, buyPrayerBeadsButton, buySwordAndShieldButton, buyExpUpButton, buyGoldUpButton, backButton;




    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.shop);

        goldText = findViewById(R.id.gold_text);
        potionText = findViewById(R.id.potion_text);
        prayerBeadsText = findViewById(R.id.prayerbeads_text);
        swordAndShieldText = findViewById(R.id.swordandshield_text);
        expUpText = findViewById(R.id.experienceup_text);
        goldUpText = findViewById(R.id.goldup_text);
        shopText = findViewById(R.id.shop_text);
        potion = findViewById(R.id.potion);
        prayerBeads = findViewById(R.id.prayerbeads);
        swordAndShield = findViewById(R.id.swordandshield);
        expUpSkill = findViewById(R.id.expup);
        goldUpSkill = findViewById(R.id.goldup);
        buyPotionButton = findViewById(R.id.buy_potion_button);
        buyPrayerBeadsButton = findViewById(R.id.buy_prayerbeads_button);
        buySwordAndShieldButton = findViewById(R.id.buy_swordandshield_button);
        buyExpUpButton = findViewById(R.id.buy_expup_button);
        buyGoldUpButton = findViewById(R.id.buy_goldup_button);
        backButton = findViewById(R.id.back_button);


        buyPotionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyPotion();
            }
        });

        buyPrayerBeadsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buySwordAndShieldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buyExpUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buyGoldUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnGame();
            }
        });


    }

    public void returnGame() {
        Intent returnGame = new Intent(ShopActivity.this, MainActivity.class);
        startActivity(returnGame);
    }

    public void buyPotion() {
        Toast.makeText(ShopActivity.this,"Potion heals 25 health points", Toast.LENGTH_SHORT);
    }
}
