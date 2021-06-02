package com.company;

import java.util.Objects;

public class IceCreamFactory {
    // Member variables
    private String recipeName;
    private double weight;
    private boolean mixed;
    private boolean pasteurized;
    private boolean readyForShipment;

    // Constructor
    public IceCreamFactory(String recipeName) {
        this.recipeName = recipeName;
        this.mixed = false;
        this.pasteurized = false;
        this.readyForShipment = false;
    }

    public IceCreamFactory(String recipeName, double weight) {
        this.recipeName = recipeName;
        this.weight = weight;
        this.mixed = false;
        this.pasteurized = false;
        this.readyForShipment = false;
    }

    // Getters & setters
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isMixed() {
        return mixed;
    }
    public void setMixed(boolean mixed) {
        this.mixed = mixed;
    }
    public boolean isPasteurized() {
        return pasteurized;
    }
    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }
    public boolean isReadyForShipment() {
        return readyForShipment;
    }
    public void setReadyForShipment(boolean readyForShipment) {
        this.readyForShipment = readyForShipment;
    }

    // Override .equals(), .hashCode(), and .toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Double.compare(that.weight, weight) == 0 && mixed == that.mixed && pasteurized == that.pasteurized && readyForShipment == that.readyForShipment && Objects.equals(recipeName, that.recipeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipeName, weight, mixed, pasteurized, readyForShipment);
    }
    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "recipeName='" + recipeName + '\'' +
                ", weight=" + weight +
                ", mixed=" + mixed +
                ", pasteurized=" + pasteurized +
                ", readyForShipment=" + readyForShipment +
                '}';
    }

    // Methods
    public void mixIceCream() {
        System.out.println("Mixing the ice cream...");
        this.setMixed(true);
    }
    public void pastuerizeIceCream() {
        System.out.println("Pastuerizing the ice cream...");
        this.setPasteurized(true);
    }
    public void prepareForShipment() {
        System.out.println("We have " + this.weight + " lbs of " + this.recipeName + " ice cream ready for shipment!");
        this.setReadyForShipment(true);
    }
}
