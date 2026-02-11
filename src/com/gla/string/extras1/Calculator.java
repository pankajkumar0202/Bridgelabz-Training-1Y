package com.gla.string.extras1;

import java.util.Scanner;
public class Calculator{
    public static double add(double a,double b){
        return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static double div(double a,double b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        String op=sc.next();
        if(op.equals("+")){
            System.out.println(add(a,b));
        }else{
            if(op.equals("-")){
                System.out.println(sub(a,b));
            }else{
                if(op.equals("*")){
                    System.out.println(mul(a,b));
                }else{
                    System.out.println(div(a,b));
                }
            }
        }
    }
}
