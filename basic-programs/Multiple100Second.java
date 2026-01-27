import java.util.Scanner;
public class Multiple100Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = 99;
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        }
        sc.close();
    }
}