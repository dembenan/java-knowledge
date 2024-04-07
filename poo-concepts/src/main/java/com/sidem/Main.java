package com.sidem;

import com.sidem.models.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sidem");
        student.setAge(20);
        System.out.println(String.format("L'etudiant %s a %s ans",student.getName(),student.getAge()));

        Employee employee = new Employee();
        employee.setName("Sidem");
        employee.setAge(20);
        employee.setSalary(75000);

        String salaryFormated = String.format("%,.0f", employee.getSalary());
        System.out.println(String.format("L'employe %s age de %s ans a un salaire de %s $ par ans",employee.getName(),employee.getAge(),salaryFormated));

        Iphone iphone = new Iphone(500,20,true);
        iphone.orderPhone();
        iphone.deleteIPhoneFromDb();
        Android android = new Android(300,30,"10.1",20,"xxxxxx");
        android.orderPhone();
        android.installNewAndroidVersion();

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

    }
}