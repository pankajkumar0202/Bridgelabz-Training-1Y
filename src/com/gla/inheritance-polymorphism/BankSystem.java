package com.gla.inheritance-polymorphism;

public class BankSystem {
    static class BankAccount {
        String accountNumber;
        double balance;
        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        void displayDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
        void displayAccountType() {
            System.out.println("Account Type: General Bank Account");
        }
    }
    static class SavingsAccount extends BankAccount {
        double interestRate;
        SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        @Override
        void displayAccountType() {
            System.out.println("Account Type: Savings Account");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayAccountType();
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }
    static class CheckingAccount extends BankAccount {
        double withdrawalLimit;
        CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }
        @Override
        void displayAccountType() {
            System.out.println("Account Type: Checking Account");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayAccountType();
            System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
        }
    }
    static class FixedDepositAccount extends BankAccount {
        int tenure;
        FixedDepositAccount(String accountNumber, double balance, int tenure) {
            super(accountNumber, balance);
            this.tenure = tenure;
        }
        @Override
        void displayAccountType() {
            System.out.println("Account Type: Fixed Deposit Account");
        }
        @Override
        void displayDetails() {
            super.displayDetails();
            displayAccountType();
            System.out.println("Tenure: " + tenure + " months");
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA202", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD303", 100000, 12);
        System.out.println("----- Savings Account -----");
        acc1.displayDetails();
        System.out.println("\n----- Checking Account -----");
        acc2.displayDetails();
        System.out.println("\n----- Fixed Deposit Account -----");
        acc3.displayDetails();
    }
}
