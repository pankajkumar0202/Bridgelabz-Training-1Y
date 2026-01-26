import java.util.Scanner;
public class Height{

      public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
         double cm = input.nextDouble();
		 double inches = cm/2.54;
		 int feet = (int)(inches / 12);
         double inches1 = inches - (feet * 12);
		  System.out.println(
		       "Your Height in cm is " +cm+ " while in feet is 	" +feet+ " and inches is " +inches1);
			   input.close();
        }
    }