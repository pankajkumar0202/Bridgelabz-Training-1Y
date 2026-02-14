package com.gla.methods.level1;

import java.util.Scanner;
public class SmallLarge{
    public static int[] find(int a,int b,int c){
        int min=a,max=a;
        if(b<min){
            min=b;
        }if(c<min){
            min=c;
        }if(b>max){
            max=b;
        }if(c>max){
            max=c;
        } return new int[]{min,max};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] r=find(a,b,c);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
