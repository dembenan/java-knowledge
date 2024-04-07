package com.sidem.models;

public class Phone {
    int price;
    double weight;

    // Constructor
    public Phone(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    public void orderPhone(){
        System.out.println("Ordering phone...");
    }
}
