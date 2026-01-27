import java.util.Scanner;
public class Multiplication{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          for(int i = 6; i<=9; i++){
		   int ans = number * i;
            System.out.println("multilpication of number : " + ans);
		}
		 sc.close();
        }
    }