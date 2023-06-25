package com.mycompany.learnjava.operators;

import java.util.Scanner;

public class ConditionalOperator {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    // Checking if the person is eligible for a discount
    if (age >= 18 && age <= 30 && isStudent) {
        System.out.println("You are eligible for a student discount!");
    } else if (age >= 60 || isStudent) {
        System.out.println("You are eligible for a senior citizen discount!");
    } else {
        System.out.println("Sorry, you are not eligible for any discounts.");
    }
   
    System.out.println("false & false: is " + Boolean.toString(false & false)); // false
    System.out.println("true & false: is " + Boolean.toString(true & false)); // false
    System.out.println("true & true: is " + Boolean.toString(true & true)); // true
    System.out.println("false & true: is " + Boolean.toString(false & true)); // false
    
    
    
    System.out.println("false | false: is " + Boolean.toString(false | false)); // false
    System.out.println("true | true: is " + Boolean.toString(true | true)); // true
    System.out.println("true | false: is " + Boolean.toString(true | false));   // true
    	
}
}
