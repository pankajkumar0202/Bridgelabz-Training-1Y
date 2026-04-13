package com.gla.generics-collections;

import java.util.ArrayList;
import java.util.List;

class Fruit {}
    class Apple extends Fruit {}
    class Mango extends Fruit {}

    class FruitBox<T extends Fruit> {
        List<T> fruits = new ArrayList<>();

        void add(T fruit) {
            fruits.add(fruit);
        }

        void display() {
            System.out.println(fruits);
        }
    }
