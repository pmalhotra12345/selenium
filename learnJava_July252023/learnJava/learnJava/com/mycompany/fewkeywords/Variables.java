package com.mycompany.fewkeywords;

/*
 *Local variables : specific to a method and have limited scope. </br>
Instance variables : associated with objects and retain their values as long as the object exists.</br>
Static variables : shared among all instances of the class and retain their values throughout the program's execution
 
 */

public class Variables {

	// Global (instance) variable
	private int instanceVariable;

	// Static variable
	private static int staticVariable;

	public void exampleMethod(int parameter) {
		// Local variable
		int localVariable = 10;

		// Accessing and modifying variables
		instanceVariable = parameter;
		localVariable++;
		System.out.println("Static variable: " + staticVariable);
		staticVariable = staticVariable + 5;

		System.out.println("Instance variable: " + instanceVariable);
		System.out.println("Local variable: " + localVariable);
		System.out.println("Static variable: " + staticVariable);
	}

	public static void main(String[] args) {
		Variables demo1 = new Variables();
		Variables demo2 = new Variables();

		demo1.exampleMethod(20);
		demo2.exampleMethod(30);
		
		final int x = 10; // Declaring a final variable 'x' and initializing it with a value of 10
        System.out.println("x: " + x);

        // Attempting to modify the value of 'x' will result in a compilation error
        // x = 20; // Uncommenting this line will cause a compilation error

	}
}
