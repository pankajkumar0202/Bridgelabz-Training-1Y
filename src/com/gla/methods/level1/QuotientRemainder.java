package com.gla.methods.level1;

import java.util.Scanner;
public class QuotientRemainder{
    public static int[] find(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] r=find(n,d);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
