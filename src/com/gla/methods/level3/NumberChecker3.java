package com.gla.methods.level3;

public class NumberChecker3{
    public static int[] reverse(int[] d){
        int[] r=new int[d.length];
        for(int i=0;i<d.length;i++){
            r[i]=d[d.length-1-i];
        }
        return r;
    }
    public static boolean equal(int[] a,int[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int[] d){
        return equal(d,reverse(d));
    }
}
