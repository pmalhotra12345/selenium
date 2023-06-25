package com.mycompnay.abstraction.interfacecomplexexample;


public class BankApp {
    public static void main(String[] args) {
        BankAccount account = BankAccountFactory.createSavingsAccount(1000.0, 0.05);
        double balance = account.getBalance();
        double interest = account.calculateInterest();

        System.out.println("Account Balance: " + balance);
        System.out.println("Interest: " + interest);
    }
}

