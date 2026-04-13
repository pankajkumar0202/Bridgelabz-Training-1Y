package com.gla.generics-collections;

public class CompareTwoValues {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
