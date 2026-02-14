package com.gla.methods.level3;

public class Matrix2{
    public static int[][] transpose(int[][] a){
        int r=a.length,c=a[0].length;
        int[][] t=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i]=a[i][j];
            }
        }
        return t;
    }
}
