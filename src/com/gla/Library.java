package com.gla;

public class Library {
   private int quantity;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private Admin admin;
     LibraryRepository libraryRepository = new LibraryRepository();
}
