package com.gla.encapsulation;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public abstract double calculateInterest();
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan Not Approved for Savings Account");
        }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    public double calculateInterest() {
        return balance * 0.02; 
    }
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Current Account: " + amount);
        } else {
            System.out.println("Loan Not Approved for Current Account");
        }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S101", "Pankaj", 8000);
        BankAccount acc2 = new CurrentAccount("C201", "Naveen", 15000);
        BankAccount[] accounts = {acc1, acc2};
        for (BankAccount acc : accounts) {
            System.out.println("\nAccount Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            Loanable loan = (Loanable) acc;
            loan.applyForLoan(5000);
        }
    }
}
