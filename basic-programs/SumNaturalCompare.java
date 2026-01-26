import java.util.Scanner;
public class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println(sum);
            System.out.println(formula);
        } else {
            System.out.println("Not natural");
        }
        sc.close();
    }
}