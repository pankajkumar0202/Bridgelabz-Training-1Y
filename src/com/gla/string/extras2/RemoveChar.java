package com.gla.string.extras2;

import java.util.Scanner;
public class RemoveChar{
    public static String remove(String s,char x){
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=x){
                r=r+s.charAt(i);
            }
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char x=sc.next().charAt(0);
        System.out.println(remove(s,x));
    }
}
