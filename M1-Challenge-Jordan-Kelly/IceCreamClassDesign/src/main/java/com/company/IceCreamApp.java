package com.company;

import java.util.Arrays;

public class IceCreamApp {
    public static void main(String[] args) {
        // PoS Ice Cream
        System.out.println("==== Store Ice Cream Example ====");
        IceCreamStore myOrder = new IceCreamStore("Mint Chocolate Chip");
        myOrder.setNumberOfScoops(2);
        myOrder.setToppings(Arrays.asList("whip cream", "hot fudge"));
        myOrder.setWaffleCone(true);

        System.out.println("-- Your Order --");
        System.out.println("Flavor: " + myOrder.getFlavorName());
        System.out.println("Number of scoops: " + myOrder.getNumberOfScoops());
        if (myOrder.isWaffleCone()) System.out.println("Waffle cone: yes");
        if (!myOrder.isWaffleCone()) System.out.println("Waffle cone: no");
        System.out.println("Toppings:");
        for (String topping: myOrder.getToppings()) {
            System.out.println("\t" + topping);
        }

        System.out.println("-- Your Order's Cost --");
        double subtotal = myOrder.calculateSubtotal(1.5, 0.5, 1);
        System.out.println("Subtotal: " + subtotal);
        double tax = myOrder.calculateSalesTax(7.5, subtotal);
        System.out.println("Tax: " + tax);
        double total = myOrder.calculateTotal(subtotal, tax);
        System.out.println("Total: " + total);


        // Factory Ice Cream
        System.out.println("\n==== Factory Ice Cream Example ====");
        IceCreamFactory businessOrder = new IceCreamFactory("Coffee Lover's");
        businessOrder.setWeight(200);

        System.out.println("-- Your Order --");
        System.out.println("Recipe: " + businessOrder.getRecipeName());
        System.out.println("Weight: " + businessOrder.getWeight() + " lbs");

        System.out.println("-- Prepare Order --");
        businessOrder.mixIceCream();
        businessOrder.pasteurizeIceCream();
        businessOrder.prepareForShipment();
    }
}
