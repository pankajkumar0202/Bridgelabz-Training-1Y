package com.gla.methods.level2;

import java.util.Scanner;
public class BMI{
    public static double bmi(double w,double h){
        double m=h/100.0;
        return w/(m*m);
    }
    public static String status(double b){
        if(b<18.5){ return "Underweight"; }
        if(b<25){ return "Normal"; }
        if(b<30){ return "Overweight"; }
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            double b=bmi(w,h);
            System.out.println(b+" "+status(b));
        }
    }
}
