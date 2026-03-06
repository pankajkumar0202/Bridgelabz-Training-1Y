package com.gla.encapsulation;

import java.util.*;
interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;  
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String policyNumber; 
    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return 200 * days; 
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber;
    }
}
class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return 100 * days;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber;
    }
}
class Truck extends Vehicle {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // extra charge
    }
}

public class Main {
    public static void VehicleRentalSystem (String[] args) {

        List<Vehicle> vehicles = Arrays.asList(
            new Car("CAR101", 2000, "POL123"),
            new Bike("BIKE202", 800, "POL456"),
            new Truck("TRK303", 5000)
        );

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("----- " + v.getType() + " -----");
            System.out.println("Rental Cost: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost: ₹" + i.calculateInsurance(days));
            }

            System.out.println();
        }
    }
}
