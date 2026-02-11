package com.gla.string.extras2;

import java.util.Scanner;
public class RemoveDuplicates{
    public static String remove(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=0;j<r.length();j++){
                if(s.charAt(i)==r.charAt(j)){
                    found=true;
                }
            }
            if(!found){
                r=r+s.charAt(i);
            }
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(remove(s));
    }
}
