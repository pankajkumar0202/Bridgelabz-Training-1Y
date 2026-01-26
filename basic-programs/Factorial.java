import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int number = sc.nextInt();
		  int fact = 1;
		  int i = 1;
		  if(number>0){
			  System.out.println("The number is positive ");
		  }
		  while(i<=number){
		      fact *= i;
		      i++;
		    }
		 System.out.println("factorial of " +number+ " is " +fact); 
	    }
    }