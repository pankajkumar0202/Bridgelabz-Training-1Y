package com.gla.Wrapper-Classess;

import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 1000000;
        int[] arr = new int[n];
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }

        long end1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            list.add(i);   
        }

        long sum2 = 0;
        for (int i = 0; i < list.size(); i++) {
            sum2 += list.get(i);   // auto-unboxing
        }

        long end2 = System.currentTimeMillis();

        System.out.println("Array sum = " + sum1);
        System.out.println("Array time = " + (end1 - start1) + " ms");

        System.out.println("ArrayList sum = " + sum2);
        System.out.println("ArrayList time = " + (end2 - start2) + " ms");
    }
}
