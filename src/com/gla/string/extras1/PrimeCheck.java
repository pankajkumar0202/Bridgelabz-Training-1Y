package com.gla.string.extras1;

import java.util.Scanner;
public class PrimeCheck{
    public static boolean prime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
}
