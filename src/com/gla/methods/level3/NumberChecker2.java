package com.gla.methods.level3;

import java.util.Scanner;
public class NumberChecker2{
    public static int sum(int[] d){
        int s=0;
        for(int i=0;i<d.length;i++){
            s+=d[i];
        }
        return s;
    }
    public static int sumSq(int[] d){
        int s=0;
        for(int i=0;i<d.length;i++){
            s+=Math.pow(d[i],2);
        }
        return s;
    }
    public static boolean harshad(int n,int s){
        return n%s==0;
    }
    public static int[][] freq(int[] d){
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++){
            f[i][0]=i;
        }
        for(int i=0;i<d.length;i++){
            f[d[i]][1]++;
        }
        return f;
    }
}
