package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable {

    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    //Add overridden get value method
    //Added big decimal getValue
    @Override
    //public double getValue()
    public BigDecimal getValue() {
        return BigDecimal.valueOf(balance);
    }

    //Add to string to print out Bank Account
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Name: " + name +
                ", Balance: $" + balance;
    }


}
