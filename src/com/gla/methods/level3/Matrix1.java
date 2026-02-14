package com.gla.methods.level3;

public class Matrix1{
    public static int[][] create(int r,int c){
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        return a;
    }
}
