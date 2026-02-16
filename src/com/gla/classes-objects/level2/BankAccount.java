package com.gla.classes-objects.level2;

import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ishant", 12345, 5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.displayBalance();
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
