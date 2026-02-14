package com.gla.methods.evel3;

public class StudentPCM{
    public static int[][] scores(int n){
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=(int)(Math.random()*90)+10;
            }
        }
        return a;
    }
}
