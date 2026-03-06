package com.gla.encapsulation;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (Getters only)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId +
                           ", Driver: " + driverName +
                           ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

// Car Class
class Car extends Vehicle implements GPS {

    private String location = "Unknown";

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // base charge 50
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

// Bike Class
class Bike extends Vehicle implements GPS {

    private String location = "Unknown";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // no base charge
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

// Auto Class
class Auto extends Vehicle implements GPS {

    private String location = "Unknown";

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // base charge 20
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

// Main Class
public class RideHailingApplication {

    // Polymorphism method
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + vehicle.calculateFare(distance));
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Pankaj", 15);
        Vehicle v2 = new Bike("B201", "Naveen", 8);
        Vehicle v3 = new Auto("A301", "Aman", 10);

        processRide(v1, 10);
        processRide(v2, 10);
        processRide(v3, 10);
    }
}
