package com.gla.inheritance-polymorphism;

public class OrderManagementSystem {
    static class Order {
        String orderId;
        String orderDate;
        Order(String orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }
        String getOrderStatus() {
            return "Order Placed";
        }
        void displayDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Order Date: " + orderDate);
            System.out.println("Status: " + getOrderStatus());
        }
    }
    static class ShippedOrder extends Order {
        String trackingNumber;
        ShippedOrder(String orderId, String orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }
        @Override
        String getOrderStatus() {
            return "Order Shipped";
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Tracking Number: " + trackingNumber);
        }
    }
    static class DeliveredOrder extends ShippedOrder {
        String deliveryDate;
        DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }

        @Override
        String getOrderStatus() {
            return "Order Delivered";
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Delivery Date: " + deliveryDate);
        }
    }
    public static void main(String[] args) {
        Order order1 = new Order("ORD101", "19-02-2026");
        Order order2 = new ShippedOrder("ORD102", "20-02-2026", "TRK12345");
        Order order3 = new DeliveredOrder("ORD103", "21-02-2026", "TRK67890", "24-02-2026");
        System.out.println("----- Basic Order -----");
        order1.displayDetails();
        System.out.println("\n----- Shipped Order -----");
        order2.displayDetails();
        System.out.println("\n----- Delivered Order -----");
        order3.displayDetails();
    }
}
