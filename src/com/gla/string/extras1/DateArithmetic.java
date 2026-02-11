package com.gla.string.extras1;

import java.time.LocalDate;
import java.util.Scanner;

    public class DateArithmetic {
    
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            LocalDate d=LocalDate.parse(input);
            LocalDate r=d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
            System.out.println(r);
        }
    }
