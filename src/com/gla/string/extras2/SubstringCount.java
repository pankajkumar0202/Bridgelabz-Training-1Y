package com.gla.string.extras2;

import java.util.Scanner;
public class SubstringCount{
    public static int count(String s,String sub){
        int c=0;
        for(int i=0;i<=s.length()-sub.length();i++){
            boolean ok=true;
            for(int j=0;j<sub.length();j++){
                if(s.charAt(i+j)!=sub.charAt(j)){
                    ok=false;
                }
            }
            if(ok){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.nextLine();
        System.out.println(count(s,sub));
    }
}
