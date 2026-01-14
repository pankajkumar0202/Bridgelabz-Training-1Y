import java.util.Scanner;
public class TotalPrice{

     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
		  double  unitprice = input.nextDouble();
		  double quantity = input.nextDouble();
          double  totalprice = unitprice * quantity;
          System.out.println(
		        "The total purchase price is INR " +totalprice+ 
		        " if the quantity " +quantity+ " and unit price is INR " +unitprice);
		  input.close();
	    }
    } 