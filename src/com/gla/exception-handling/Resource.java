import java.io.*;

public class Resource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(br.readLine());
        }
        catch (IOException exp) {
            System.out.println("Error reading file");
        }
    }
}
