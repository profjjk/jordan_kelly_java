package com.company;

import java.util.Objects;

public class IceCreamPoS {
    private double totalPrice;
    private double price;
    private double salesTax;
    private int numberOfScoops;
    private int numberOfToppings;
    private boolean waffleCone;

    public IceCreamPoS(double totalPrice, double price, double salesTax, int numberOfScoops, int numberOfToppings, boolean waffleCone) {
        this.totalPrice = totalPrice;
        this.price = price;
        this.salesTax = salesTax;
        this.numberOfScoops = numberOfScoops;
        this.numberOfToppings = numberOfToppings;
        this.waffleCone = waffleCone;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public boolean isWaffleCone() {
        return waffleCone;
    }

    public void setWaffleCone(boolean waffleCone) {
        this.waffleCone = waffleCone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamPoS that = (IceCreamPoS) o;
        return Double.compare(that.totalPrice, totalPrice) == 0 && Double.compare(that.price, price) == 0 && Double.compare(that.salesTax, salesTax) == 0 && numberOfScoops == that.numberOfScoops && numberOfToppings == that.numberOfToppings && waffleCone == that.waffleCone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPrice, price, salesTax, numberOfScoops, numberOfToppings, waffleCone);
    }

    @Override
    public String toString() {
        return "IceCreamPoS{" +
                "totalPrice=" + totalPrice +
                ", price=" + price +
                ", salesTax=" + salesTax +
                ", numberOfScoops=" + numberOfScoops +
                ", numberOfToppings=" + numberOfToppings +
                ", waffleCone=" + waffleCone +
                '}';
    }
}
