package com.gla.string.extras1;

import java.util.Scanner;
public class MaxThree{
    public static int max(int x,int y,int z) {
        int m=x;
        if(y>m) {
            m=y;
        }if(z>m) {
            m=z;
        }return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(max(x,y,z));
    }
}
