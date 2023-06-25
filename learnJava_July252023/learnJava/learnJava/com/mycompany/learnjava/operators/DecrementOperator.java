package com.mycompany.learnjava.operators;

public class DecrementOperator {

	public static void main(String[] args) {

		/**
		 * Pre decrement operator
		 * -- decrements value by 1
		 * --x is equivalent to x=x - 1; (or x -=1; ).
		 */

		int c = 2;
		System.out.println("Pre decrement operator while applying -- " + --c); // decrements to 1 and assigns 1 to c
		System.out.println("Pre decrement operator after applying -- " + c);

		// post increment operator

		int d = 2;
		System.out.println("Post decrement operator while applying -- " + d--);// value still prints as 2 as value decrements after assigning
		System.out.println("Post decrement operator while applying -- " + d); // decremented value is visible her
		
		
		int aNumber = 10;
		aNumber--;
		aNumber--;
		aNumber--;
		
		System.out.println(aNumber);
	}

}
