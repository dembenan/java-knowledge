package com.sidem.models;

public class Chien extends Animal{

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
