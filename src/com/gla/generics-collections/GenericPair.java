package com.gla.generics-collections;
class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    T getFirst() { return first; }
    U getSecond() { return second; }
}
public class GenericPair {
    static void main() {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
    }
}
