package com.gla.classes-objects.level1;

class Item {

    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {

        Item item = new Item();

        item.itemCode = 101;
        item.itemName = "Pen";
        item.price = 10.5;

        int quantity = 5;

        item.displayDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
