package com.gla.wrapper-classess;

public class StudentMarksReport {
    public static void main(String[] args) {
        String[] marks = {"85", "null", "90", "abc"};
        int sum = 0, count = 0;
        for (String i : marks) {
            try {
                if (!i.equals("null")) {
                    sum += Integer.parseInt(i);
                    count++;
                }
            } catch (Exception exp) {
            }
        }

        System.out.println(sum / count);
    }
}
