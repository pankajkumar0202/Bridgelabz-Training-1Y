import java.util.*;

public class finallyBlockExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException exp) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
