package com.sidem;

 class User {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
 class Employee extends User {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
public class Heritage {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Sidem");
        employee.setAge(20);
        employee.setSalary(75000);
        String salaryFormated = String.format("%,.0f", employee.getSalary());
        System.out.println(String.format("L'employe %s age de %s ans a un salaire de %s $ par ans",employee.getName(),employee.getAge(),salaryFormated));

    }
}
