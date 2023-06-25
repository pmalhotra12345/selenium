package com.mycompany.learnjava.operators;

public class IncrementOperator {

	public static void main(String[] args) {

		int a = 5;
		int b = ++a;  // Pre-increment: 'a' is incremented to 6, and then 6 is assigned to 'b'
		
		System.out.println("a value is: " + a + " b value is:" + b);
		 
		int c = a++;  // Post-increment: 'a' (6) is assigned to 'c', and then 'a' is incremented to 7
		System.out.println("a value is: " + a + " c value is:" + c);

	}

}
