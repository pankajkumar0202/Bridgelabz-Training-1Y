package com.gla.generics-collections;

import java.util.List;

public class PriceCalculator {
    class Product {
        double price;
        double getPrice() {
            return price;
        }
    }
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product i : items) {
            total += i.getPrice();
        }
        return total;
    }
}
