package com.company;

public class Warrior extends Character {
    private int shieldStrength;

    public Warrior(String name) {
        super(name, "warrior", 75, 100, 100, 50, 10);
        this.shieldStrength = 100;
    }

    public void decreaseShieldStrength(int attackPower) {
        this.shieldStrength -= attackPower;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
