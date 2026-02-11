package com.gla.string.extras2;

import java.util.Scanner;
public class ReplaceWord{
    public static String replace(String s,String oldW,String newW){
        String r="";
        String cur="";
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)==' '){
                if(cur.equals(oldW)){
                    r=r+newW;
                }else{
                    r=r+cur;
                }
                if(i!=s.length()){
                    r=r+" ";
                }
                cur="";
            }else{
                cur=cur+s.charAt(i);
            }
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String oldW=sc.nextLine();
        String newW=sc.nextLine();
        System.out.println(replace(s,oldW,newW));
    }
}
