package com.company;

public class App {
    public static void main(String[] args) {
        Customer jamesBond = new Customer("James", "Bond", "james@007.gov", "(007) 007-0070", true);
        Address address = new Address("007 Secret Blvd.", "London", "England", "00700");

        jamesBond.setShippingAddress(address);
        jamesBond.setBillingAddress(address);

        System.out.println(jamesBond.toString());
    }
}
