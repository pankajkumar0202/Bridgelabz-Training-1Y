package com.gla.classes-objects.level1;
import java.util.Scanner;
class BankAccount {
    public String accountNumber;     
    protected String accountHolder;  
    private double balance;         
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }
}
