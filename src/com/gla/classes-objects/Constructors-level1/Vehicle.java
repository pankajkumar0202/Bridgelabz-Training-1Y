package com.gla.classes-objects.level1;

class Vehicle {

    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Pankaj", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
