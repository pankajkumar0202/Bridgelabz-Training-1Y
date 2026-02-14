package com.gla.methods.level3;

public class FactorTask{
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
    public static int greatest(int[] a){
        return a[a.length-1];
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
    public static double cubeProduct(int[] a){
        double p=1;
        for(int i=0;i<a.length;i++){
            p*=Math.pow(a[i],3);
        }
        return p;
    }
}
