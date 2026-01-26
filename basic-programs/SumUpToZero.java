import java.util.Scanner;
public class SumUpToZero{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          double number = sc.nextDouble();
		  double sum = 0.0;
		  while(number!=0){
		     sum += number;
		     number = sc.nextDouble();
		    }
          System.out.println("sum oftotal number " +sum);
            sc.close();
        }
    }