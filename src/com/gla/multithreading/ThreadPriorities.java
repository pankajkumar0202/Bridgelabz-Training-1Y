package com.gla.MultiThreading;

class Ticket extends Thread {
    int id;
    String type;
    int time;

    public Ticket(int id, String type, int time) {
        this.id = id;
        this.type = type;
        this.time = time;
    }

    public void run() {
        System.out.println("Ticket " + id + " " + type + " Started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
        }
        System.out.println("Ticket " + id + " Completed");
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, "Critical", 2);
        Ticket t2 = new Ticket(2, "Feature", 3);
        Ticket t3 = new Ticket(3, "Query", 1);
        Ticket t4 = new Ticket(4, "Feedback", 2);
        Ticket t5 = new Ticket(5, "Critical", 3);
        Ticket t6 = new Ticket(6, "Feature", 2);
        Ticket t7 = new Ticket(7, "Query", 1);
        Ticket t8 = new Ticket(8, "Feedback", 2);
        Ticket t9 = new Ticket(9, "Critical", 3);
        Ticket t10 = new Ticket(10, "Query", 1);

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);
        t5.setPriority(10);
        t6.setPriority(4);
        t7.setPriority(2);
        t8.setPriority(1);
        t9.setPriority(10);
        t10.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
