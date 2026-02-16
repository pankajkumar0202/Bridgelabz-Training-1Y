package com.gla.classes-objects.level2;
import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added.");
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item       : " + itemName);
        System.out.println("Price      : " + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + total);
    }
}
public class Main {
    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 1200, 2);
        cart.displayTotalCost();
        cart.addItem(1);
        cart.displayTotalCost();
        cart.removeItem(2);
        cart.displayTotalCost();
    }
}
