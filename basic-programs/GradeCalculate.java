import java.util.Scanner;
public class GradeCalculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        double avg = (p + c + m) / 3;
        String grade, remarks;
        if (avg >= 80) {
            grade = "A";
            remarks = "Above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B";
            remarks = "At agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C";
            remarks = "Approaching agency-normalized standards";
        } else if (avg >= 50) {
            grade = "D";
            remarks = "Well below agency-normalized standards";
        } else if (avg >= 40) {
            grade = "E";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        System.out.println("Average Mark: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}