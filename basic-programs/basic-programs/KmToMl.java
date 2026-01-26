import java.util.Scanner;

public class KmToMl{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double kilometers = sc.nextDouble();
		 double miles = kilometers * 0.621371;
         System.out.println(miles);
         sc.close();
        }
    }