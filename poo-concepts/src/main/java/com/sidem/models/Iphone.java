package com.sidem.models;

public class Iphone extends Phone {

    boolean fingerPrint;

    public Iphone(int price, double weight, boolean fingerPrint) {
        super(price, weight);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    public void deleteIPhoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }

    @Override // This is about polymorphism, see below
    public void orderPhone(){
        System.out.println("Ordering my new iPhone and deleting the old one...");
    }
}
