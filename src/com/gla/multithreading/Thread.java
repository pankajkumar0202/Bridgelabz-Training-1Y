package com.gla.multithreading;

class Order implements Runnable {
    int id;
    String name;
    int time;

    public Order(int id, String name, int time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public void run() {
        System.out.println("Order " + id + " Picked");
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
        }

        System.out.println("Order " + id + " In Transit");
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
        }

        System.out.println("Order " + id + " Delivered by " + Thread.currentThread().getName());
    }
}

public class Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "Pizza", 2));
        Thread t2 = new Thread(new Order(2, "Burger", 3));
        Thread t3 = new Thread(new Order(3, "Pasta", 1));
        Thread t4 = new Thread(new Order(4, "Sandwich", 2));
        Thread t5 = new Thread(new Order(5, "Biryani", 3));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
