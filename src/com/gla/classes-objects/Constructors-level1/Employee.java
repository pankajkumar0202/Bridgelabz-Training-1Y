package com.gla.classes-objects.level1;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {

    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        System.out.println("Salary: " + getSalary());     
        System.out.println("Team Name: " + teamName);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager(1001, "IT", 75000, "Development");

        m.displayDetails();

        m.setSalary(85000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
