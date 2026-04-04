public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            int index = 5;
            System.out.println("Value: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException exp) {
            System.out.println("Array is not initialized!");
        }
    }
}
