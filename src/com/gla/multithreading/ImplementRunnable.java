package com.gla.MultiThreading;

class Entry implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Student Entry Running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class QuestionPaper implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception exp) {
        }
        System.out.println("Question Paper Distributed");
    }
}

class Attendance implements Runnable {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (Exception exp) {
        }
        System.out.println("Attendance Marked");
    }
}

class Collection implements Runnable {
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (Exception exp) {
        }
        System.out.println("Answer Sheets Collected");
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Entry());
        Thread t2 = new Thread(new QuestionPaper());
        Thread t3 = new Thread(new Attendance());
        Thread t4 = new Thread(new Collection());

        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(8);
        t4.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
