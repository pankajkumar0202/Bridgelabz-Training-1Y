package com.gla.classes-objects.level1;

class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 69999);
        phone1.displayDetails();
    }
}
