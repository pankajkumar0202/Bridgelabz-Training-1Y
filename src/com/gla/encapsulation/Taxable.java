package com.gla.encapsulation;

import java.util.*;
interface Taxable {
    double calculateTax();
}
abstract class Product {
    private int id;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public abstract double calculateDiscount();
    public double finalPrice() {
        double tax = (this instanceof Taxable) ? 
                     ((Taxable)this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }
    public void display() {
        System.out.println(name + " Final Price: ₹" + finalPrice());
    }
}
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
    public double calculateTax() {
        return getPrice() * 0.18;
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }
    public double calculateTax() {
        return getPrice() * 0.05;
    }
}
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class Main {
    public static void ECommercePlatform(String[] args) {
        List<Product> list = Arrays.asList(
            new Electronics(1, "Laptop", 70000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 3000)
        );
        for (Product p : list) {
            p.display();
        }
    }
} 
