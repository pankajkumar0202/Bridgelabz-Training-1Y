package com.gla.wrapper-classess;

import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(null);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr1) list.add(i);

        for (Integer i : arr2) {
            if (Objects.nonNull(i)) list.add(i);
        }

        int sum = 0;
        for (int i : list) sum += i;

        System.out.println(sum / list.size());
    }
}
