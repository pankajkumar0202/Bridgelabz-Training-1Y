package com.gla.methods.level1;

import java.util.Scanner;
public class ParkRounds{
    public static double rounds(double a,double b,double c){
        double perimeter=a+b+c;
        return 5000/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(rounds(a,b,c));
    }
}
