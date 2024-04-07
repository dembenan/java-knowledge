package com.sidem;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        User user = new User();
        user.setName("siaka");
        user.setAge(24);
        System.out.println("USER ===="+user.toString());
        User employ = new Employee();
        System.out.println("USER ===="+employ.toString());


    }
}