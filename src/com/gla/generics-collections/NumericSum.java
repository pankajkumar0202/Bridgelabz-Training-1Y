package com.gla.generics-collections;

import java.util.List;

public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
