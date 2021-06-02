package com.company;

public class App {
    public static void main(String[] args) {
        Farmer billyBob = new Farmer("Billy-Bob");
        Constable javert = new Constable("Javert", "Paris");
        Warrior achilles = new Warrior("Achilles");

        System.out.println("==== The Characters ====");
        System.out.println(billyBob.toString());
        System.out.println(javert.toString());
        System.out.println(achilles.toString());

        System.out.println("\n... Let's make them do something ...");
        System.out.println("** " + billyBob.getName() + " is minding his own business and farming his fields:");
        billyBob.plow();
        System.out.println("** He is attacked by a big, stupid bully:");
        System.out.print(achilles.getName() + " is ");
        achilles.attack();
        billyBob.decreaseHealth(achilles.getAttackPower());
        System.out.println(billyBob.getName() + "'s health is now " + billyBob.getHealth() +
                ", which is a decrease of " + achilles.getAttackPower() + ".");
        System.out.print(billyBob.getName() + " is now ");
        billyBob.move();
        System.out.println("** " + javert.getName() + " arrives to arrest " + achilles.getName() + " for being a jerk.");
        System.out.print(javert.getName() + " is ");
        javert.attack();
        achilles.decreaseShieldStrength(javert.getAttackPower());
        System.out.println(achilles.getName() + "'s shield absorbs " + javert.getName() + "'s attack.");
        System.out.println(achilles.getName() + "'s shield strength is now " + achilles.getShieldStrength() +
                ", which is a decrease of " + javert.getAttackPower() + ".");
        System.out.println(achilles.getName() + " has a change of heart and yields.");
        System.out.print(javert.getName() + " is now ");
        javert.arrest();
    }
}