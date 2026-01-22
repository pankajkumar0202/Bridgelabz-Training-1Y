import java.util.Scanner;
public class Operator{
     public static void main(String[] args){
         int i = 0;
         System.out.println("value :" +i); //0
         i++;
         System.out.println("value a :" +i++);  //1
         System.out.println("value b :" +i);  //2
         ++i;
         System.out.println("value c :" +i++);  //3
         System.out.println("value d :" +i++);   //4
		 
		  int z = i + i++ + ++i +i + ++i + i++;
		 System.out.println("value z :" +z);
		 
		 int y = i - i++ - --i +i - ++i + i++;
		 System.out.println("value y :" +y);
		 
		 //for loop
		 
		 for(int k = 0; k<10; k++){
			  System.out.println("k: " +k);
		    }
			
			// while loop 
			int j = 10; 
			while(j>0){
			  System.out.println("j: " +j);
			  j--;
		    }
			
			// do while loop
			
			int k = 10;
			do{
				System.out.println("k :" +k);
				k--;
			}
			while(k>0);
			
			System.out.println("enter the number :");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("value of n : " +n);
			
		}
    }
	
	
	
	
	