import java.util.Scanner;

public class SimpleIntrest{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double p = sc.nextDouble();
		 double rate = sc.nextDouble();
		 double time = sc.nextDouble();
		 double si = ( p * rate * time ) / 100;
         System.out.println(si);
         sc.close();
        }
    }