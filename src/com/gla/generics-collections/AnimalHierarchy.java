package com.gla.generics-collections;

import java.util.List;

public class AnimalHierarchy {
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal i : animals) {
            System.out.println(i);
        }
    }
}
