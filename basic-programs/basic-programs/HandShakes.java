import java.util.Scanner;
public class HandShakes{

     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
		  long n = input.nextLong();
          long possible_handshakes = (n * (n - 1)) / 2;
          System.out.println(possible_handshakes);
		  input.close();
	    }
    }