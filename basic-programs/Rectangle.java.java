import java.util.Scanner;

public class Rectangle{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double length = sc.nextDouble();
		 double width = sc.nextDouble();
		 double p = 2 * ( length + width );
         System.out.println(p);
         sc.close();
        }
    }