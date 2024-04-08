package com.sidem;
class Animal {
    public void crier() {
        System.out.println("un cri d'animal");
    }
}
class Chien extends Animal{

    @Override
    public void crier() {
        System.out.println("Whouaf whouaf !");
    }
    public void crier(boolean maitreIsHere){
        if (maitreIsHere) {
            System.out.println("Whouaf whouaf en presence du maitre! ");
        }else{
            System.out.println("Whouaf whouaf !");
        }
    }
}
class Chat extends  Animal{
    @Override
    public void crier() {
        System.out.println("Miaou !");
    }
}
class Phone {
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
class Iphone extends Phone {

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
class Android extends Phone {

    // Some new fields
    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    // Constructor
    public Android(int price, double weight, String androidVersion, int screenSize, String secretDeviceCode) {
        super(price, weight); // Android inherits Phone’s fields
        //this - reference to the current object
        //super - reference to the parent object

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    // New Android-specific method, does not exist in the Phone class
    public void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }

}


public class Polimorphisme {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.crier(); // affiche "un cri d'animal"

        Chat chat = new Chat();
        chat.crier();   // affiche "Miaou !"

        Chien chien = new Chien();
        chien.crier();  // affiche "Whouaf whouaf !"
        chien.crier(false);
        chien.crier(true);

        animal = chat;
        animal.crier(); // affiche "Miaou !"

        animal = chien;
        animal.crier(); // affiche "Whouaf whouaf !"

        Iphone iphone = new Iphone(500,20,true);
        iphone.orderPhone();
        iphone.deleteIPhoneFromDb();
        Android android = new Android(300,30,"10.1",20,"xxxxxx");
        android.orderPhone();
        android.installNewAndroidVersion();

    }
}
