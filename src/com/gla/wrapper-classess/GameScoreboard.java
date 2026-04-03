package com.gla.wrapper-classess;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 20, null, 30};

        int count = 0;
        int sum = 0;

        for (Integer i : scores) {
            if (i == null) count++;
            else sum += i;
        }

        System.out.println(count);
        System.out.println(sum);
    }
}
