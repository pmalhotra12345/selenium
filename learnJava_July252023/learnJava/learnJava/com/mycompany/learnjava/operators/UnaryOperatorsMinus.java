package com.mycompany.learnjava.operators;

public class UnaryOperatorsMinus {

	public static void main(String[] args) {
		
	       
	       /*==================================
	        * Variable multiplies by -1(negates the integer value)
	        ==================================*/
	      int a=8,b=-2;
	       
	    // Using Unary - operator on positive value
           System.out.println("Value of a is "+a);
           int result=-a; // a value changes -8
           System.out.println("After unary minus operation on 8, the result is "+result);
	       
           
        // Using Unary - operator on negative value
           System.out.println("Value of b is "+b);
           result=-b; // b value changes to 2
           System.out.println("After unary minus operationon -2, result is "+result);
	       
	       

	}

}
