public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            try {
                int value = arr[5];
                int result = value / 0;
                System.out.println(result);
            }
            catch (ArrayIndexOutOfBoundsException exp) {
                System.out.println("Invalid array index!");
            }
        }
        catch (ArithmeticException exp) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
