package com.mycompany.learnjava.operators;

public class UnaryOperatorsPlus {

	public static void main(String[] args) {

		// Does not change the value but standard unary operator
		// + - ++ --
		// ++a , a++

		// Initializing
		int a = 8, b = -2;
		int result;

		System.out.println("Value of a is " + a);
		result = -a;
		System.out.println("After unary plus operation result is " + result);

		System.out.println("Value of b is " + b);
		result = +b;
		System.out.println("After unary plus operation result is " + result);

		// If there is no change of value why we use it?

		// 1. explicitly indicate the positive sign of a numeric value

		int positiveValue = +42; // Explicitly indicating positive sign

		// 2. Numeric Promotion: If you have variables of smaller numeric types (byte,
		// short, or char) and you want to promote them to a larger numeric type (int,
		// long, float, or double)
		byte byteValue = 10;
		int intValue = +byteValue;  // Promoting byte to int using unary plus operator
	
		System.out.println("byteValues is " + byteValue + " and int value" + intValue);
	}

}
