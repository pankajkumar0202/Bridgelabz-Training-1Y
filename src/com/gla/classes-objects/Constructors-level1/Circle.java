package com.gla.classes-objects.level1;
import java.util.Scanner;
class Circle {
    double radius;
    Circle() {
        this(1.0);   

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      
        Circle c2 = new Circle(5);    

        c1.display();
        c2.display();
    }
}
