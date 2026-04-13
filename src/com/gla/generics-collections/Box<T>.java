package com.gla.generics-collections;

class Box<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
}
class main {
    static void main() {
        Box<Integer> b1 = new Box<>();
        b1.set(10);
        Box<String> b2 = new Box<>();
        b2.set("Hello World");
    }
}
