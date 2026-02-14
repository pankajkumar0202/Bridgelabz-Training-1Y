package com.gla.methods.level2;

import java.util.Scanner;
public class Quadratic{
    public static void roots(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d>0){
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }else{
            if(d==0){
                System.out.println(-b/(2*a));
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        roots(a,b,c);
    }
}
