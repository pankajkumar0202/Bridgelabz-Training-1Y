package com.gla.inheritance-polymorphism;

public class VehicleSystem {
    static class Vehicle {
        int maxSpeed;
        String fuelType;

        Vehicle(int maxSpeed, String fuelType) {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }

        void displayInfo() {
            System.out.println("Max Speed: " + maxSpeed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }
    }
    static class Car extends Vehicle {
        int seatCapacity;

        Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Seat Capacity: " + seatCapacity);
        }
    }
    static class Truck extends Vehicle {
        double loadCapacity; // in tons

        Truck(int maxSpeed, String fuelType, double loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Load Capacity: " + loadCapacity + " tons");
        }
    }
    static class Motorcycle extends Vehicle {
        boolean hasGear;

        Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
            super(maxSpeed, fuelType);
            this.hasGear = hasGear;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
        }
    }
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);
        for (Vehicle v : vehicles) {
            System.out.println("----- Vehicle Info -----");
            v.displayInfo();  // Calls overridden method
            System.out.println();
        }
    }
}
