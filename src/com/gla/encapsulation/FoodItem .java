package com.gla.encapsulation;

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation (Getters only)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + 
                           ", Price: " + price + 
                           ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}
class VegItem extends FoodItem implements Discountable {

    private double discount = 0;

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
   @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - discount;
    }
    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }
   @Override
    public String getDiscountDetails() {
        return "Veg Item Discount Applied: " + discount;
    }
}
class NonVegItem extends FoodItem implements Discountable {

    private double discount = 0;
    private final double extraCharge = 20; // fixed extra charge

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
   @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + extraCharge;
        return total - discount;
    }
    @Override
    public void applyDiscount(double percentage) {
        discount = ((getPrice() * getQuantity()) + extraCharge) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount Applied: " + discount;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 1);

        FoodItem[] order = {item1, item2};

        for (FoodItem item : order) {
            item.getItemDetails();

            Discountable d = (Discountable) item;
            d.applyDiscount(10); // 10% discount

            System.out.println(d.getDiscountDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("-----------------------");
        }
    }
}
