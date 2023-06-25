package com.mycompany.learnjava.polymorphism;

class BanksAccount {
	protected double balance;

	public BanksAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
		} else {
			System.out.println("Insufficient funds.");
		}
	}
	
	// Below will give error as return type does no matters
	
	public String withdraw(double amount,double amount1,double amount2) {
		return "nothing";
	}
	
	public Integer withdraw2(double amount) {
		return 1;
	}
	
	// Below will give error as access modifier does not matter
	//private void withdraw(double amount) {}

	public void withdraw(double amount, double fee) {
		double totalAmount = amount + fee;
		if (totalAmount <= balance) {
			balance -= totalAmount;
			System.out.println(
					"Withdrawal of " + amount + " with a fee of " + fee + " successful. Remaining balance: " + balance);
		} else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public void withdraw(double amount, String fee) {
		
	}
}

// Also known as static polymorphism or early binding because the decision of which method to invoke
// is made at compile-time, based on the information available in the code.

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		BanksAccount account = new BanksAccount(5000);

		account.withdraw(1000); // Invokes the withdraw(double amount) method
		account.withdraw(2000, 100); // Invokes the withdraw(double amount, double fee) method

		/**
		 * Rules:Method name: The methods being overloaded must have the same name.
		 * 
		 * Parameter list: The parameter lists of the methods must be different. This
		 * can be achieved by having a different number of parameters or different types
		 * of parameters.
		 * 
		 * Return type: The return type of the methods is not considered during method
		 * overloading. Overloaded methods can have the same or different return types.
		 * 
		 * Access modifiers: The access modifiers (e.g., public, private, protected) and
		 * other modifiers (e.g., static, final) may be different for the overloaded
		 * methods.
		 * 
		 * Exception handling: Overloaded methods can throw different exceptions.
		 * However, if a method in a superclass declares an exception, the overriding
		 * methods in the subclasses can only declare the same exception or a subclass
		 * of that exception.
		 * 
		 * Method resolution: During compilation, the Java compiler determines which
		 * method to call based on the number and types of arguments provided. The
		 * decision is made based on the closest match between the arguments and the
		 * parameters of the available overloaded methods.
		 * 
		 */
	}
}
