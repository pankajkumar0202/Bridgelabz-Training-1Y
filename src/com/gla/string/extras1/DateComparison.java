package com.gla.string.extras1;
import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LocalDate date1=LocalDate.parse(sc.nextLine());
        LocalDate date2=LocalDate.parse(sc.nextLine());
        if(date1.isBefore(date2)){
            System.out.println("Before");
        }else{
            if(date1.isAfter(date2)){
                System.out.println("After");
            }else{
                System.out.println("Same");
            }
        }
    }
}
