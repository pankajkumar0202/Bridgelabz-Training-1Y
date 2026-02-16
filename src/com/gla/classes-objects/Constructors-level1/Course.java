package com.gla.classes-objects.level1;

class Course {

    // Instance Variables
    String courseName;
    int duration;      
    double fee;

    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println();
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", 6, 30000);
        Course c2 = new Course("Data Structures", 4, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
