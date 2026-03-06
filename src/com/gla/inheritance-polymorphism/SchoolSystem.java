package com.gla.inheritance-polymorphism;

public class SchoolSystem {
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        void displayRole() {
            System.out.println("Role: Person");
        }
    }
    static class Teacher extends Person {
        String subject;
        Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }
        @Override
        void displayRole() {
            System.out.println("Role: Teacher");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayRole();
            System.out.println("Subject: " + subject);
        }
    }
    static class Student extends Person {
        String grade;
        Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }
        @Override
        void displayRole() {
            System.out.println("Role: Student");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayRole();
            System.out.println("Grade: " + grade);
        }
    }
    static class Staff extends Person {
        String department;
        Staff(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }
        @Override
        void displayRole() {
            System.out.println("Role: Staff");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayRole();
            System.out.println("Department: " + department);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Teacher("Mr. kapoor", 40, "Mathematics");
        Person p2 = new Student("Rajkumar", 16, "10th Grade");
        Person p3 = new Staff("Aditya", 35, "Administration");
        System.out.println("----- Teacher Details -----");
        p1.displayDetails();
        System.out.println("\n----- Student Details -----");
        p2.displayDetails();
        System.out.println("\n----- Staff Details -----");
        p3.displayDetails();
    }
}
