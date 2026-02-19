package com.gla;

public class Main {
    public static void main(String[]args){
        Library library = new Library();
        library.libraryRepository = new LibraryRepository();
        Admin admin = new Admin();
    }
}
