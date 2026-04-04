package com.gla.wrapper-classess;
import java.util.Scanner;
public class Wrapperconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Integer obj = num;
        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}
