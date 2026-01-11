import java.util.Scanner;

public class Cylinder{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double r = sc.nextDouble();
		 double height = sc.nextDouble();
		 double volume = 3.141 * r * r * height;
         System.out.println(volume);
         sc.close();
        }
    }
