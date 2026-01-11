import java.util.Scanner;

public class Power{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double base = sc.nextDouble();
		 double exponent = sc.nextDouble();
		 double res = Math.pow(base,exponent);
         System.out.println(res);
         sc.close();
        }
    }