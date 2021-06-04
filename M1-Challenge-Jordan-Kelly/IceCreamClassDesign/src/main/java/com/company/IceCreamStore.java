package com.company;

import java.util.List;
import java.util.Objects;

public class IceCreamStore {
    // Member variables
    private String flavorName;
    private int numberOfScoops;
    private List<String> toppings;
    private boolean waffleCone;

    // Constructor
    public IceCreamStore(String name) {
        this.flavorName = name;
    }

    public IceCreamStore(String name, int numberOfScoops, boolean waffleCone) {
        this.flavorName = name;
        this.numberOfScoops = numberOfScoops;
        this.waffleCone = waffleCone;
    }

    // Getters & setters
    public String getFlavorName() {
        return flavorName;
    }
    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }
    public int getNumberOfScoops() {
        return numberOfScoops;
    }
    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
    public boolean isWaffleCone() {
        return waffleCone;
    }
    public void setWaffleCone(boolean waffleCone) {
        this.waffleCone = waffleCone;
    }

    // Override .equals(), .hashCode(), and .toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamStore that = (IceCreamStore) o;
        return numberOfScoops == that.numberOfScoops && waffleCone == that.waffleCone && Objects.equals(flavorName, that.flavorName) && Objects.equals(toppings, that.toppings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorName, numberOfScoops, toppings, waffleCone);
    }
    @Override
    public String toString() {
        return "IceCreamStore{" +
                "name='" + flavorName + '\'' +
                ", numberOfScoops=" + numberOfScoops +
                ", toppings=" + toppings +
                ", waffleCone=" + waffleCone +
                '}';
    }

    // Methods
    public double calculateSubtotal(double pricePerScoop, double pricePerTopping, double waffleConePrice) {
        double subtotal = 0;
        if (this.waffleCone) {
            subtotal = (this.numberOfScoops * pricePerScoop) + (this.toppings.size() * pricePerTopping) + waffleConePrice;
        } else {
            subtotal = (this.numberOfScoops * pricePerScoop) + (this.toppings.size() * pricePerTopping);
        }
        return subtotal;
    }

    public double calculateSalesTax(double taxPercentage, double subtotal) {
        double tax = taxPercentage / 100;
        return subtotal * tax;
    }
    public double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }
}
