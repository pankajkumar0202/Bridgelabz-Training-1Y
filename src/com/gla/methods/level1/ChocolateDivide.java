package com.gla.methods.Level1;

import java.util.Scanner;
public class ChocolateDivide{
    public static int[] divide(int ch,int kids){
        return new int[]{ch/kids,ch%kids};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        int kids=sc.nextInt();
        int[] r=divide(ch,kids);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
