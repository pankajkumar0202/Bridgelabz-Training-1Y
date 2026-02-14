package com.gla.methods.level1;

import java.util.Scanner;
public class Handshakes{
    public static int count(int n){
        return n*(n-1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
