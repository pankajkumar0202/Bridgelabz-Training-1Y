import java.util.Scanner;
public class UniversityFee2{

      public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
         int fee = sc.nextInt();
         double discountPercent = sc.nextDouble();
		 double discount = fee*discountPercent;
		 double payfee = fee - discount;
		
         System.out.println(
		       "The discount amount is INR " + discount+ " and final discounted fee is INR " +payfee);
        }
    }
