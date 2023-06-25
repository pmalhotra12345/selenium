package com.mycompany.basics.loops;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		// If else statement
		if(a < 10 ) {
			System.out.println("i am lower number");
		}
		else {  
			System.out.println("I am higher number");
		}
		
		// Else if statement
		int b= 20;
		int c = 30;
		
		if(b == c) {
			System.out.println("equal");
			if(0 > 1) {
				System.out.println("it never executes");
			}
			else {
				System.out.println("I am always executed");
			}
		}
		else if(b < c) {
			System.out.println("Lower");
		}
		else if(b > c) {
			System.out.println("higher");
		}
		else {
			System.out.println("I dont know");
		}
		

	}

}
