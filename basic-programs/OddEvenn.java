import java.util.Scanner;
public class OddEven{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          if(number > 0){
		     for(int i = 1; i <= number; i++){
		         if(i % 2 == 0){
		             System.out.println("even number is " +i);
		            }
		            else{
		             System.out.println("odd number is " +i);
		            }
				}
		    }
            
            sc.close();
        }
    }