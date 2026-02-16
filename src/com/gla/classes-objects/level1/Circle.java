class Circle {

    double radius;

    double calculateArea() {
        return 3.14159 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14159 * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 5;

        c.display();
    }
}
