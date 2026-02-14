package com.gla.methods.level2;

import java.util.Scanner;
public class Friends{
    public static int minIndex(int[] a){
        int m=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[m]){
                m=i;
            }
        } return m;
    }
    public static int maxIndex(double[] a){
        int m=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[m]){
                m=i;
            }
        } return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        double[] h=new double[3];
        for(int i=0;i<3;i++){ age[i]=sc.nextInt(); }
        for(int i=0;i<3;i++){ h[i]=sc.nextDouble(); }
        System.out.println(minIndex(age));
        System.out.println(maxIndex(h));
    }
}
