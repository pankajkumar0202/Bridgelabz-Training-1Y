package com.gla.wrapper-classess;

public class BankTransaction {

    public static double getRemaining(Double limit, double used) {
        if (limit == null) return 0.0;
        return limit - used;
    }

    public static void main(String[] args) {
        System.out.println(getRemaining(4000.0, 3000.0));
        System.out.println(getRemaining(null, 3000.0));
    }
}
