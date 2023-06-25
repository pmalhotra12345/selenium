package com.mycompany.fewkeywords;

public class StaticExample {

	// Static variable
	private static int staticVariable = 10;

	private int nonStaticVairable = 10;

	// Static method
	// cannot be instantiated using the new keyword
	public static void staticMethod() {
		System.out.println("Static method called");
		System.out.println("Value of staticVariable: " + staticVariable);
	}

	// Static nested class
	// only access static members of the enclosing class
	// primarily used for grouping related utility methods, constants, or
	// implementing nested classes
	static class StaticNestedClass {
		private int nestedVariable;

		public StaticNestedClass(int nestedVariable) {
			this.nestedVariable = nestedVariable;
		}

		public void displayValues() {
			System.out.println("Outer variable: " + staticVariable);
			System.out.println("Nested variable: " + nestedVariable);
			// System.out.println("non nested variable: " +nonStaticVairable); // will give
			// compilation error as we are accessing a not static varibale
		}
	}

	public static void main(String[] args) {
		// Accessing static variable
		System.out.println("Value of staticVariable: " + staticVariable);

		// Modifying static variable
		staticVariable = 20;
		System.out.println("Updated value of staticVariable: " + staticVariable);

		// Calling static method
		staticMethod();

		StaticExample.StaticNestedClass nestedObj = new StaticExample.StaticNestedClass(20);
		nestedObj.displayValues();
		
		StaticExample se = new StaticExample();
		
		System.out.println(se.nonStaticVairable);
	}
}
