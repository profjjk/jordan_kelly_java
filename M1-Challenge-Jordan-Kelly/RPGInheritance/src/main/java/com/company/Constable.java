package com.company;

public class Constable extends Character {
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, "constable", 60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest() {
        System.out.println("arresting...");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
