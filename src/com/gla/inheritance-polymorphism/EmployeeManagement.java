package com.gla.inheritance-polymorphism;

public class EmployeeManagement {

    static class Employee {
        String name;
        int id;
        double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        int teamSize;

        Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }
    static class Developer extends Employee {
        String programmingLanguage;

        Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }
    static class Intern extends Employee {
        int duration; // in months

        Intern(String name, int id, double salary, int duration) {
            super(name, id, salary);
            this.duration = duration;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Internship Duration: " + duration + " months");
        }
    }
    public static void main(String[] args) {

        Employee m = new Manager("Pankaj", 101, 80000, 5);
        Employee d = new Developer("Naman", 102, 60000, "Java");
        Employee i = new Intern("Aman", 103, 20000, 6);

        System.out.println("----- Manager Details -----");
        m.displayDetails();

        System.out.println("\n----- Developer Details -----");
        d.displayDetails();

        System.out.println("\n----- Intern Details -----");
        i.displayDetails();
    }
}
