import java.util.*;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x / y;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException exp) {
            System.out.println("Can't divide by zero");
        }
        catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
    }
}
