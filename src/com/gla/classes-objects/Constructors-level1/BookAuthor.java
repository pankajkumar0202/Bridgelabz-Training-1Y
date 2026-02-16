package com.gla.classes-objects.level1;
import java.util.Scanner;
class BookAuthor {
    public String ISBN;        
    protected String title;   
    private String author;     

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
