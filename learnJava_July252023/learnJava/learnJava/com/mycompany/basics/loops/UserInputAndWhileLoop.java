package com.mycompany.basics.loops;

import java.util.Scanner;

public class UserInputAndWhileLoop {
/**
 * @param args
 */
public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any input string");
	String enteredValue = scanner.nextLine();
	System.out.println("printing the entered value is: " + enteredValue);
	
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter any input integer");
	
	int n;
	
	while( (n = input.nextInt()) != 0) {
		System.out.println("entered values is : " + n);
		System.out.println("Enter an Integer again : " + n);
	}
	
	System.out.println("Exited the loop");
	
	
	/*
	int i = 0;
	
	System.out.println( i < 1 );
	
	System.out.println( i == 0 );
	
	System.out.println( i != 0 ); // '!' symbol indicates not
	
	boolean value = true;	
	System.out.println( !value); // prints false
	
	boolean value1 = false;	
	System.out.println( !value1); // prints true
	*/
}
}
