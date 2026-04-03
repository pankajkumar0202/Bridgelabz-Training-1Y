package com.gla.wrapper-classess;

public class ValidAge {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (Exception exp) {
            return false;
        }
    }
     public static void main(String[] args) {
        System.out.println(isValidAge("25"));
        System.out.println(isValidAge("16"));
        System.out.println(isValidAge("abc"));
    }
}
