package com.gla.inheritance-polymorphism;

public class LibrarySystem {
    static class Book {
        String title;
        int publicationYear;

        Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Publication Year: " + publicationYear);
        }
    }
    static class Author extends Book {
        String name;
        String bio;

        Author(String title, int publicationYear, String name, String bio) {
            super(title, publicationYear);  // Calling superclass constructor
            this.name = name;
            this.bio = bio;
        }

        @Override
        void displayInfo() {
            super.displayInfo();  // Display book details
            System.out.println("Author Name: " + name);
            System.out.println("Bio: " + bio);
        }
    }
    public static void main(String[] args) {
        Author book1 = new Author(
                "Java Programming",
                2026,
                "Pankaj kumar Rajput",
                "Software Developer and Java Enthusiast"
        );
        System.out.println("----- Book Details -----");
        book1.displayInfo();
    }
}
