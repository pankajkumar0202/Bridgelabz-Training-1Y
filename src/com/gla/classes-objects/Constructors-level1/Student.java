package com.gla.classes-objects.level1;

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);   
        System.out.println("Name: " + name);              
        System.out.println("CGPA: " + getCGPA());          
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(41, "Pankaj", 8.1, "Computer Science");

        pg.displayDetails();
        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
