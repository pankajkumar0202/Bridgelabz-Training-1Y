package com.gla.methods.level1;

import java.util.Scanner;
public class NumberSign{
    public static int check(int n){
        if(n>0){
            return 1;
        }
        if(n<0){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
}
