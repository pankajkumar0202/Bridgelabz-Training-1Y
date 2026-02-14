package com.gla.methods.level2;

import java.util.Scanner;
public class Factors{
    public static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        int[] a=new int[c];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a[k]=i;
                k++;
            }
        }
        return a;
    }
    public static int sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public static int product(int[] a){
        int p=1;
        for(int i=0;i<a.length;i++){
            p*=a[i];
        }
        return p;
    }
    public static double sumSquare(int[] a){
        double s=0;
        for(int i=0;i<a.length;i++){
            s+=Math.pow(a[i],2);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(sumSquare(f));
    }
}
