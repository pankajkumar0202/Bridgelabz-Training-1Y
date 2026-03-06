package com.gla.inheritance-polymorphism;

public class RestaurantSystem {
    static class Person {
        String name;
        int id;
        Person(String name, int id) {
            this.name = name;
            this.id = id;
        }
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
    }

    interface Worker {
        void performDuties();
    }
    static class Chef extends Person implements Worker {
        Chef(String name, int id) {
            super(name, id);
        }
        @Override
        public void performDuties() {
            System.out.println("Duties: Preparing and cooking meals.");
        }
        void displayInfo() {
            displayDetails();
            System.out.println("Role: Chef");
            performDuties();
        }
    }
    static class Waiter extends Person implements Worker {
        Waiter(String name, int id) {
            super(name, id);
        }
        @Override
        public void performDuties() {
            System.out.println("Duties: Taking orders and serving customers.");
        }
        void displayInfo() {
            displayDetails();
            System.out.println("Role: Waiter");
            performDuties();
        }
    }
    public static void main(String[] args) {
        Chef chef1 = new Chef("Ramesh", 101);
        Waiter waiter1 = new Waiter("Suresh", 202);
        System.out.println("----- Chef Details -----");
        chef1.displayInfo();
        System.out.println("\n----- Waiter Details -----");
        waiter1.displayInfo();
    }
}
