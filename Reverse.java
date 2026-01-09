import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter your number-:");
      int n = sc.nextInt();	 
	  int reverse = 0;
	  int ld;
	  int i=0;
	  while(n!=0){
		  ld = n%10;
		  reverse = reverse*10+ld;
		  n=n/10;
	  }
	  System.out.print(reverse);
					}           
			   
			   
			   }