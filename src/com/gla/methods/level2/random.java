package com.gla.methods.level2;

public class random{
    public static int[] gen(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random()*9000)+1000;
        }
        return a;
    }
    public static double[] stats(int[] a){
        int min=a[0],max=a[0],sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){ min=a[i]; }
            if(a[i]>max){ max=a[i]; }
            sum+=a[i];
        }
        return new double[]{sum/(double)a.length,min,max};
    }
    public static void main(String[] args){
        int[] a=gen(5);
        double[] s=stats(a);
        System.out.println(s[0]);
        System.out.println((int)s[1]);
        System.out.println((int)s[2]);
    }
}
