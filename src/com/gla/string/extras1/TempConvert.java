package com.gla.string.extras1;

import java.util.Scanner;
public class TempConvert{
    public static double fToC(double f){
        return (f-32)*5/9;
    }
    public static double cToF(double c){
        return c*9/5+32;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        String t=sc.next();
        if(t.equals("F")){
            System.out.println(fToC(v));
        }else{
            System.out.println(cToF(v));
        }
    }
}
