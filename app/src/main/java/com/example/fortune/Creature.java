package com.example.fortune;

public class Creature {
    int minDamage;
    int maxDamage;
    int xp;
    int gold;
    int survive;

    public Creature(int minDamage, int maxDamage, int xp, int gold, int survive) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.xp = xp;
        this.gold = gold;
        this.survive = survive;
    }

}
