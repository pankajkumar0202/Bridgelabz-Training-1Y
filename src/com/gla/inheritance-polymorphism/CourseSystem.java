package com.gla.inheritance-polymorphism;

public class CourseSystem {
    static class Course {
        String courseName;
        int duration; 
        Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }
        void displayDetails() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " hours");
        }
    }
    static class OnlineCourse extends Course {
        String platform;
        boolean isRecorded;
        OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Platform: " + platform);
            System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        }
    }
    static class PaidOnlineCourse extends OnlineCourse {
        double fee;
        double discount; 
        PaidOnlineCourse(String courseName, int duration, String platform,
                         boolean isRecorded, double fee, double discount) {
            super(courseName, duration, platform, isRecorded);
            this.fee = fee;
            this.discount = discount;
        }
        double calculateFinalFee() {
            return fee - (fee * discount / 100);
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Original Fee: ₹" + fee);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Fee: ₹" + calculateFinalFee());
        }
    }
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 40);
        Course c2 = new OnlineCourse("Web Development", 60, "Udemy", true);
        Course c3 = new PaidOnlineCourse("Java Masterclass", 80, "Coursera", true, 5000, 20);
        System.out.println("----- Basic Course -----");
        c1.displayDetails();
        System.out.println("\n----- Online Course -----");
        c2.displayDetails();
        System.out.println("\n----- Paid Online Course -----");
        c3.displayDetails();
    }
}
