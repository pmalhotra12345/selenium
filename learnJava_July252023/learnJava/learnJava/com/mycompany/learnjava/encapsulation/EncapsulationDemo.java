package com.mycompany.learnjava.encapsulation;

import java.util.Map;

public class EncapsulationDemo {
	public static void main(String[] args) {
		User user = new User("john_doe", "password123");

		/**
		 * The User class encapsulates the username and password as private instance
		 * variables. The access to these variables is controlled through getter methods
		 * (getUsername() and getPassword()), allowing read-only access to the private
		 * data.
		 */
		// user.username = "xxxx" // Enabling this will give compilation error

		BankAccount bankAccount = new BankAccount(user);

		UserDetails userDetails = bankAccount.getUserDetails();

		/**
		 * 1. The BankAccount class encapsulates the user and account details. <br>
		 * 2. The user object (User instance) is stored as a private instance
		 * variable.<br>
		 * The getUserDetails() method encapsulates the logic for retrieving the account
		 * details from a dummy database call. <br>
		 * 3. The retrieveAccountDetailsFromDatabase() method is private, ensuring that
		 * it can only be accessed within the BankAccount class.
		 */

		Account[] accountDetails = userDetails.getAccountDetails();

		System.out.println("Welcome, " + user.getUsername() + "!");
		System.out.println("Your account details:");

		for (Account account : accountDetails) {
            String accountNumber = account.getAccountNumber();
            double balance = account.getBalance();
            System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
        }
	}
}
