package com.mycompany.accessmodifier;

public class PrivateMethodAndVariable {
	 private int privateVariable = 10;

	    private void privateMethod() {
	        System.out.println("This is a private method in MyClass.");
	    }

	    public void publicMethod() {
	        System.out.println("This is a public method in MyClass.");
	        privateMethod(); // Accessing the private method within the same class
	        System.out.println("Private variable value: " + privateVariable); // Accessing the private variable within the same class
	    }
}


