import java.util.Scanner;

public class Circle{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double r = sc.nextDouble();
		 double a = 3.141 * r * r;
         System.out.println(a);
         sc.close();
        }
    }
