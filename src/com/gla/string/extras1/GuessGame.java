package com.gla.string.extras1;
import java.util.Scanner;
public class GuessGame{
    public static int guess(){
        return 1+(int)(Math.random()*100);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int g=guess();
            System.out.println("Computer guess: "+g);
            String f=sc.next();
            if(f.equals("correct")){
                System.out.println("Guessed");
                break;
            }else{
                if(f.equals("high")){
                }else{
                }
            }
        }
    }
}
