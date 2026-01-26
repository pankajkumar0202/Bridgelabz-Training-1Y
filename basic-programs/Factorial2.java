import java.util.Scanner;
public class Factorial2{
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int number = sc.nextInt();
		  int fact = 1;
		  if(number>0){
			  System.out.println("The number is positive ");
		    }
		    for(int i = 1; i<=number; i++){
		      fact *= i;
		    }   
		    System.out.println("factorial of " +number+ " is " +fact); 
	    }
    }