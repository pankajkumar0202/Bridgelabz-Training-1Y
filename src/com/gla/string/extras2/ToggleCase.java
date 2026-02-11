package com.gla.string.extras2;

import java.util.Scanner;
public class ToggleCase{
    public static String toggle(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }else{
                if(ch>='a'&&ch<='z'){
                    ch=(char)(ch-32);
                }
            }
            r=r+ch;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(toggle(s));
    }
}
