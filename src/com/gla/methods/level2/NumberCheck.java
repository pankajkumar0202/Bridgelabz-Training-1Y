package com.gla.methods.level2;

import java.util.Scanner;
public class NumberCheck{
    public static boolean positive(int n){ return n>=0; }
    public static boolean even(int n){ return n%2==0; }
    public static int compare(int a,int b){
        if(a>b){ return 1; }
        if(a<b){ return -1; }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(positive(a[i])){
                if(even(a[i])){
                    System.out.println("Positive Even");
                }else{
                    System.out.println("Positive Odd");
                }
            }else{
                System.out.println("Negative");
            }
        }
        System.out.println(compare(a[0],a[4]));
    }
}
