package com.mycompany.learnjava.encapsulation;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
	private User user;

    public BankAccount(User user) {
        this.user = user;
    }

    public UserDetails getUserDetails() {
        // Dummy database call
        Account[] accounts = retrieveAccountDetailsFromDatabase();
        return new UserDetails(accounts);
    }

    private Account[] retrieveAccountDetailsFromDatabase() {
        // Simulating the database call and returning account details
        Account[] accounts = new Account[3];
        accounts[0] = new Account("123456789", 1000.0);
        accounts[1] = new Account("987654321", 2500.0);
        accounts[2] = new Account("567890123", 500.0);
        return accounts;
    }
}