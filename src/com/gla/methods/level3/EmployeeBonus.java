package com.gla.methods.level3;

public class EmployeeBonus{
    public static double[][] data(){
        double[][] a=new double[10][2];
        for(int i=0;i<10;i++){
            a[i][0]=(int)(Math.random()*90000)+10000;
            a[i][1]=(int)(Math.random()*10)+1;
        }
        return a;
    }
    public static double[][] bonus(double[][] a){
        double[][] b=new double[10][2];
        for(int i=0;i<10;i++){
            double rate=a[i][1]>5?0.05:0.02;
            b[i][0]=a[i][0]+a[i][0]*rate;
            b[i][1]=a[i][0]*rate;
        }
        return b;
    }
}
