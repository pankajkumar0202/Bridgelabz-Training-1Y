package com.gla.generics-collections;

import java.util.ArrayList;
import java.util.List;

public class GenericCart {
    class Cart<T> {
        List<T> items = new ArrayList<>();

        void addItem(T item) { 
           items.add(item); 
        }
        void removeItem(T item) {
          items.remove(item); 
        }

        void displayItems() {
            System.out.println(items);
        }
    }
}
