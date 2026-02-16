
package com.gla.classes-objects.level1;
import java.util.Scanner;
class Book2 {
    String title;
    String author;
    double price;
    boolean available;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;   
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
    void display() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + (available ? "Yes" : "No"));
        System.out.println();
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 450);
        b1.display();
        b1.borrowBook();  
        b1.display();
        b1.borrowBook();   
    }
}
