package com.gla.inheritance-polymorphism;

public class VehicleManagementSystem {
    static class Vehicle {
        protected int maxSpeed;
        protected String model;
        Vehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }
        public void displayDetails() {
            System.out.println("Model: " + model);
            System.out.println("Max Speed: " + maxSpeed + " km/h");
        }
    }
    interface Refuelable {
        void refuel();
    }
    static class ElectricVehicle extends Vehicle {
        ElectricVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }
        public void charge() {
            System.out.println("Charging the electric vehicle...");
        }
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Type: Electric Vehicle");
        }
    }
    static class PetrolVehicle extends Vehicle implements Refuelable {
        PetrolVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }
        @Override
        public void refuel() {
            System.out.println("Refueling the petrol vehicle...");
        }
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Type: Petrol Vehicle");
        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new ElectricVehicle(180, "Tesla Model 3");
        Vehicle v2 = new PetrolVehicle(200, "Honda City");
        System.out.println("----- Electric Vehicle -----");
        v1.displayDetails();
        ((ElectricVehicle) v1).charge();
        System.out.println("\n----- Petrol Vehicle -----");
        v2.displayDetails();
        ((PetrolVehicle) v2).refuel(); 
    }
}
