package com.gla.string.extras2;

import java.util.Scanner;
public class LongestWord{
    public static String find(String s){
        String max="",cur="";
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)==' '){
                if(cur.length()>max.length()){
                    max=cur;
                }
                cur="";
            }else{
                cur=cur+s.charAt(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s));
    }
}
