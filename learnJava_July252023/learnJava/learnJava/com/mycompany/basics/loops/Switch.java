package com.mycompany.basics.loops;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any input integer");

		String enteredValue = input.nextLine();

		switch (enteredValue) {
		case "java": {

			System.out.println("My favourite is java");
			break;
		}
		case "CPP": {

			System.out.println("My favourite is CPP");
			break;
		}

		case "python": {

			System.out.println("My favourite is python");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + enteredValue);
		}
*/
		
		for (int i = 0; i < 7; i++) {
			if (i == 3) {
				break;
			}
			System.out.printf("int values is %d %d   %s \n", i, 1, "any string");

		}
		

	}

}
