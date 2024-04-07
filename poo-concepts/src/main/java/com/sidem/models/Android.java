package com.sidem.models;

public class Android extends Phone {

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
