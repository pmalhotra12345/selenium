package com.mycompnay.abstraction.interfacecomplexexample;

public class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

