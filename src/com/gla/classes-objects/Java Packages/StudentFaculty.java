class Student {

    public void displayStudent() {
        String name = "Naveen";
        int rollNo = 101;

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Faculty {

    public void displayFaculty() {
        String name = "Dr. Sharma";
        String subject = "Computer Science";

        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        System.out.println();

        f.displayFaculty();
    }
}
