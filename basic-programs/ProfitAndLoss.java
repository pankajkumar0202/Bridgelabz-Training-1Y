public class ProfitAndLoss{

     public static void main(String[] args){
         int costprice = 129;
         int sellprice = 191;
         int profit = sellprice - costprice;
         double profit_percantage = ( profit * 100.0  ) /costprice;
         System.out.println("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellprice
		 + "\n" +"The Profit is INR " + profit + " and the Profit Percentage is " + profit_percantage);
		 
        }
	}
