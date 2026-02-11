package com.gla.string.extras2;

import java.util.Scanner;
public class LexicoCompare{
    public static int compare(String a,String b){
        int n=Math.min(a.length(),b.length());
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
        }
        return a.length()-b.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int r=compare(a,b);
        if(r<0){
            System.out.println("First comes before Second");
        }else{
            if(r>0){
                System.out.println("First comes after Second");
            }else{
                System.out.println("Both equal");
            }
        }
    }
}
