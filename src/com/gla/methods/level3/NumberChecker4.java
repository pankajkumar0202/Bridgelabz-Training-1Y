package com.gla.methods.level3;

public class NumberChecker4{
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean neon(int n){
        int s=0,x=n*n;
        while(x>0){
            s+=x%10;
            x/=10;
        }
        return s==n;
    }
    public static boolean spy(int n){
        int s=0,p=1;
        while(n>0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return s==p;
    }
    public static boolean automorphic(int n){
        int sq=n*n;
        while(n>0){
            if(n%10!=sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }
    public static boolean buzz(int n){
        return n%7==0||n%10==7;
    }
}
