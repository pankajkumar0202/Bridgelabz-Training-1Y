package com.gla.inheritance-polymorphism;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
class Car {
    private Engine engine;  

    Car(Engine engine) {     
        this.engine = engine;
    }
    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);

        car.drive();
    }
}
