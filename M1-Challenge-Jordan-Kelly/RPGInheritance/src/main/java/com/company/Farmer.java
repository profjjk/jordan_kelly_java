package com.company;

public class Farmer extends Character{

    // Constructor
    public Farmer(String name) {
        super(name, "farmer", 75, 100, 75, 10, 1);
    }

    // Farmer methods
    public void plow() {
        System.out.println("Plowing...");
    }
    public void harvest() {
        System.out.println("Harvesting...");
    }
}
