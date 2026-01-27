import java.util.Scanner;
public class SumNaturalCompare2{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
		  int sum = 0;
          if(n>0){
	          for(int i = 1; i<=n; i++){
	             sum += i; 
	            }
	           int formula = n*(n+1)/2;
	           System.out.println(sum==formula);
			   System.out.println("sum of natural number " +sum);
			   System.out.println("sum of natural number using formula " +formula);
	        }else{
			System.out.println("not a natural number ");
			}
         sc.close();
       }
    }