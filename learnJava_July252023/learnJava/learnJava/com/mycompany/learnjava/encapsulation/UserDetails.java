package com.mycompany.learnjava.encapsulation;

import java.util.Map;

public class UserDetails {
    private Account[] accountDetails;

    public UserDetails(Account[] accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Account[] getAccountDetails() {
        return accountDetails;
    }
}
