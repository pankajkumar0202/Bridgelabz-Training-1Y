package com.gla.inheritance-polymorphism;

abstract class LspShape {
    abstract int getArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    int getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 10);
        Shape s2 = new Square(5);

        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
    }
}
