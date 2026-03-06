package com.gla.encapsulation;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    protected void setAvailability(boolean status) {
        isAvailable = status;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration(); // in days
}
class Book extends LibraryItem implements Reservable {

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
class Magazine extends LibraryItem implements Reservable {

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Basics", "James Gosling");
        LibraryItem item2 = new Magazine("M201", "Tech Monthly", "Editor");
        LibraryItem item3 = new DVD("D301", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;  // Polymorphism
            r.reserveItem("Ishant");

            System.out.println("Available: " + r.checkAvailability());
            System.out.println("----------------------");
        }
    }
}
