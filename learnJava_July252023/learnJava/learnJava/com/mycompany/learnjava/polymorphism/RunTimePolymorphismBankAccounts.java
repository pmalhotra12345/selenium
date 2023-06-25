package com.mycompany.learnjava.polymorphism;

/**
 * polymorphism = Many forms. For example Person can be a father, a client, a teacher
 * 
 * 
 * During program execution(run time) JVM decides which method to call thats why it is called run time polymorphism
 * 
 * 
 * In this class runtime polymorphism is achieved by calculateInterest() method. Observe this
 * method through out the different parent and child classes
 * 
 *
 */

//BankAccount class (superclass)
class BankAccount {
	protected double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	//  defines the calculateInterest() method with a generic implementation.
	public void calculateInterest() {
		System.out.println("Calculating interest for a bank account in Parennt");
	}
}

//SavingsAccount class (subclass)
class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	// overrides parent's calculateInterest() method with its own implementation specific to savings accounts
	@Override
	public void calculateInterest() {
		double interest = balance * interestRate;
		System.out.println("Calculating interest for a savings account: " + interest);
	}
}

//CurrentAccount class (subclass)
class CurrentAccount extends BankAccount {
	public CurrentAccount(double balance) {
		super(balance);
	}

	// No overridden calculateInterest() method, uses the one from BankAccount class
}

//FixedDepositAccount class (subclass)
class FixedDepositAccount extends BankAccount {
	private int tenure;
	private double interestRate;

	public FixedDepositAccount(double balance, int tenure, double interestRate) {
		super(balance);
		this.tenure = tenure;
		this.interestRate = interestRate;
	}

	//It overrides the parent'ss method with its own implementation specific to fixed deposit accounts
	@Override
	public void calculateInterest() {
		double interest = balance * (interestRate / 100) * tenure;
		System.out.println("Calculating interest for a fixed deposit account: " + interest);
	}

	// Additional method
	public void printMaturityDetails() {
		System.out.println("It is maturing at 5 years old: ");

	}
}

public class RunTimePolymorphismBankAccounts {
	public static void main(String[] args) {
		BankAccount account1 = new SavingsAccount(5000, 0.05);
		BankAccount account2 = new CurrentAccount(10000);

		//Runtime polymorphism allows different objects to respond differently to the same method call based on their actual types
		// Single action in different ways
		
		account1.calculateInterest(); // Invokes overridden calculateInterest() from SavingsAccount class(here at run time child class method will be executed)
		account2.calculateInterest(); // Invokes calculateInterest() from BankAccount class

		// Additional method specific to FixedDepositAccount
		if (account2 instanceof FixedDepositAccount) {
			FixedDepositAccount fixedDepositAccount = (FixedDepositAccount) account2;
			fixedDepositAccount.printMaturityDetails();
		}

	}
}
