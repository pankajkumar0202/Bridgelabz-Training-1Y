package com.gla.classes-objects.level1;
import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;
    CarRental() {
        customerName = "Customer";
        carModel = "Standard";
        rentalDays = 1;
        ratePerDay = 1000;
    }
    CarRental(String name, String model, int days, double rate) {
        customerName = name;
        carModel = model;
        rentalDays = days;
        ratePerDay = rate;
    }
    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Rate/Day      : " + ratePerDay);
        System.out.println("Total Cost    : " + calculateTotalCost());
        System.out.println();
    }
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Pankaj", "SUV", 3, 2000);
        r1.display();
        r2.display();
    }
}
