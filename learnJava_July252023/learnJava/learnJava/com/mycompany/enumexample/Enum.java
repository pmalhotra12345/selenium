package com.mycompany.enumexample;

/**
 * Enums are set of applicable values
 * 
 * @author user
 *
 */
public class Enum {

	public static void main(String[] args) {
		Directions d = Directions.EAST;
		System.out.println("Direction = " + d);
	}

	enum Directions {
		EAST, WEST, NORTH, SOUTH;
	}
}
