import java.util.Scanner;

public class Fahrenheit{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double cel = sc.nextDouble();
         double frht = ( cel * 9/5 ) + 32;
         System.out.println(frht);
         sc.close();
        }
    }