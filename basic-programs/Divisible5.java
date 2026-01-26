import java.util.Scanner;
public class Divisible5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%5==0){
			System.out.println("Is the number " +number+ " divisible by 5? " + "true");
		}else{
			System.out.println(" Is the number " +number+ " divisible by 5? " + "false");
		}
			
	}
}