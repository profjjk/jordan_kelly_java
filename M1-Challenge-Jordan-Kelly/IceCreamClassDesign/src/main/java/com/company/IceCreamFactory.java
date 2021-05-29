package com.company;

import java.util.Objects;

public class IceCreamFactory {
    private String name;
    private double weight;
    private double shippingCost;
    private double inventoryAmount;

    public IceCreamFactory(String name, double weight, double shippingCost, double inventoryAmount) {
        this.name = name;
        this.weight = weight;
        this.shippingCost = shippingCost;
        this.inventoryAmount = inventoryAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(double inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Double.compare(that.weight, weight) == 0 && Double.compare(that.shippingCost, shippingCost) == 0 && Double.compare(that.inventoryAmount, inventoryAmount) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, shippingCost, inventoryAmount);
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", shippingCost=" + shippingCost +
                ", inventoryAmount=" + inventoryAmount +
                '}';
    }
}
