package com.gla.wrapper-classess;

import java.util.*;

public class Employee {
    public static void main(String[] args) {
        int[] ages = {22, 28, 25, 40};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ages) {
            list.add(i);
        }

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
