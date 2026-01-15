public class UniversityFee{

      public static void main(String[] args){
         int fee = 125000;
         double discountPercent = 0.1;
		 double discount = fee*discountPercent;
		 double payfee = fee - discount;
		
         System.out.println(
		       "The discount amount is INR " + discount+ " and final discounted fee is INR " +payfee);
        }
    }
