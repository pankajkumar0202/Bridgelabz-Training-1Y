package com.gla.classes_objects.level1;

class Employee {

    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Tushar";
        emp.id = 101;
        emp.salary = 45000;
        emp.displayDetails();
    }
}
