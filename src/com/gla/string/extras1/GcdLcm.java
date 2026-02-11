package com.gla.string.extras1;

import java.util.Scanner;
public class GcdLcm{
    public static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}
