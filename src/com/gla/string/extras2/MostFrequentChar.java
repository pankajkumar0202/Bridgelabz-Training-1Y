package com.gla.string.extras2;

import java.util.Scanner;
public class MostFrequentChar{
    public static char find(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)]++;
        }
        int max=0;
        char ch=' ';
        for(int i=0;i<256;i++){
            if(f[i]>max){
                max=f[i];
                ch=(char)i;
            }
        }
        return ch;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s));
    }
}
