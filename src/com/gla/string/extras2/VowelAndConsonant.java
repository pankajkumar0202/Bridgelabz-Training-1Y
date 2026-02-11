package com.gla.string.extras1;
import java.util.Scanner;

public class VowelAndConsonant {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str =sc. nextLine();
            str = str.toLowerCase();
            int vowel = 0;
            int consonant = 0;
            for(int i = 0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }else if (ch>='a' && ch<='z'){
                    consonant++;
                }
            }
            System.out.println("vowels are : " + vowel);
            System.out.println("consonant are : " +consonant );
            sc.close();
        }
    }

