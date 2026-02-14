package com.gla.methods.level1;

import java.util.Scanner;
public class trigonometric{
    public static double[] calc(double angle){
        double r=Math.toRadians(angle);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double[] v=calc(a);
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
    }
}
