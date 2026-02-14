package com.gla.methods.level3;

public class OTP{
    public static int otp(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean unique(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
