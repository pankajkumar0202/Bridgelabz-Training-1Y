package com.gla.Wrapper-Classess;
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 70.21;
        double d = obj;
        int i = (int) d;
        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int: " + i);
    }
}
