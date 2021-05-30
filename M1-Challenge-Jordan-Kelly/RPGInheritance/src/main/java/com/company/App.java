package com.company;

public class App {
    public static void main(String[] args) {
        Farmer billyBob = new Farmer("Billy-Bob");
        Constable javert = new Constable("Javert", "Paris");
        Warrior achilles = new Warrior("Achilles");

        System.out.println("==== The Players ====");
        System.out.println(billyBob.toString());
        System.out.println(javert.toString());
        System.out.println(achilles.toString());
    }
}
