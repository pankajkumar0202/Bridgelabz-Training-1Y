import java.util.Scanner;
public class SquareParameter{

     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
		  double perimeter = input.nextDouble();
		  double side = perimeter/4;
		  System.out.println(
		       "The length of the side is " +side+ " whose perimeter is " +perimeter);
			   input.close();
	    }
    }
