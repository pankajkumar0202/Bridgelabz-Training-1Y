package com.gla.methods.level3;

import java.util.Scanner;
public class NumberChecker1{
    public static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int[] digits(int n,int c){
        int[] d=new int[c];
        for(int i=c-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }
    public static boolean duck(int[] d){
        for(int i=1;i<d.length;i++){
            if(d[i]==0){
                return true;
            }
        }
        return false;
    }
    public static boolean armstrong(int[] d){
        int p=d.length,sum=0;
        for(int i=0;i<d.length;i++){
            sum+=Math.pow(d[i],p);
        }
        int n=0;
        for(int i=0;i<d.length;i++){
            n=n*10+d[i];
        }
        return sum==n;
    }
    public static int[] largest(int[] d){
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]>m1){
                m2=m1;
                m1=d[i];
            }else{
                if(d[i]>m2){
                    m2=d[i];
                }
            }
        }
        return new int[]{m1,m2};
    }
    public static int[] smallest(int[] d){
        int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]<m1){
                m2=m1;
                m1=d[i];
            }else{
                if(d[i]<m2){
                    m2=d[i];
                }
            }
        }
        return new int[]{m1,m2};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=count(n);
        int[] d=digits(n,c);
        System.out.println(duck(d));
        System.out.println(armstrong(d));
    }
}
