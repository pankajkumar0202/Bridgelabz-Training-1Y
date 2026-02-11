package com.gla.string.extras2;

import java.util.Scanner;
public class PalindromeCheck2{
    public static boolean check(String s){
        int st=0,en=s.length()-1;
        while(st<en){
            if(s.charAt(st)!=s.charAt(en)){
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(check(s));
    }
}
