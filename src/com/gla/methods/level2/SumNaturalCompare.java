package com.gla.methods.level2;

import java.util.Scanner;
public class SumNaturalCompare{
    public static int rec(int n){
        if(n<=1){
            return n;
        }
        return n+rec(n-1);
    }
    public static int formula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
        System.out.println(formula(n));
    }
}
