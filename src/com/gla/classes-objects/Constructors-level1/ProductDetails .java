package com.gla.classes-objects.level1;
import java.util.Scanner;
class ProductDetails {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;  
    }
    void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price  : " + price);
        System.out.println();
    }
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        Product.displayTotalProducts();
    }
}
