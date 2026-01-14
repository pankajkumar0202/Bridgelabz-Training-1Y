import java.util.Scanner;
public class AreaTriangle{

     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
		  double base = input.nextDouble();
          double height = input.nextDouble();
		  double area = 0.5 * base * height;
		  double areaCm = area * 6.4516;
         System.out.println("The area of the triangle in square inches is " + area);
        System.out.println(" and the area of the triangle in square centimeters is " + areaCm);
			   input.close();
	    }
    }