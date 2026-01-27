import java.util.Scanner;
public class ZaraBonus{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          double salary = sc.nextDouble();
		  int year = sc.nextInt();
          double bonus = 0;
          if(year > 5){
		      bonus = ( 5 * salary ) /100;
		      System.out.println("The bonus amount is " +bonus);
		    }
		    else{
		      System.out.println("employees service less then 5 year");
		    }
            sc.close();
        }
    }