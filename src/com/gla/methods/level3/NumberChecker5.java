package com.gla.methods.level3;

public class NumberChecker5{
    public static int sumDiv(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        return s;
    }
    public static boolean perfect(int n){
        return sumDiv(n)==n;
    }
    public static boolean abundant(int n){
        return sumDiv(n)>n;
    }
    public static boolean deficient(int n){
        return sumDiv(n)<n;
    }
    public static boolean strong(int n){
        int s=0,t=n;
        while(t>0){
            int d=t%10,f=1;
            for(int i=1;i<=d;i++){
                f*=i;
            }
            s+=f;
            t/=10;
        }
        return s==n;
    }
}
