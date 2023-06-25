package com.mycompnay.abstraction.interfacecomplexexample;

public class BankAccountFactory {
    public static BankAccount createSavingsAccount(double balance, double interestRate) {
        return new SavingsAccount(balance, interestRate);
    }
}

