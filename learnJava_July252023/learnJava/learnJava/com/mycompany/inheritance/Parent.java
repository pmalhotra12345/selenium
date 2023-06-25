package com.mycompany.inheritance;

//super class
public class Parent {
	String message = "This is Parent variable";

	void add(int a, int b) {
		System.out.println(a + "+" + b + " = " + (a + b));
	}
	
	private void multiply(int a, int b) {
		System.out.println(a + "*" + b + " = " + (a * b));
	}
	
	protected void modulus(int a, int b) {
		System.out.println(a + "%" + b + " = " + (a % b));
	}
}
