package com.mycompany.basics.loops;

public class HelloWorld {

	 static int ageGlobal = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Worldffdfd");

		String name = "Saranya";

		System.out.println("My orignal name is " + name); 

		
		name = "Vandana";
		
		System.out.println("My changed name is " + name); // sysout
		
		printMyAge(10);
		

		boolean amIOlder = 1000 < 10;

		System.out.println("am i older" + amIOlder);
		
		printSomeOtherAge();
		/**
		 * Arrays
		 */
		
		String[] familyMembers = { "fm1","fm2","fm3"};
		int[] age ={10,11,12};
		
		//int[] age =new int[3];
		
		System.out.println("my family number one" + familyMembers[0]);
		System.out.println("my family number two" + familyMembers[1]);
		System.out.println("my family number three" + familyMembers[2]);
		System.out.println("my array length is  " + familyMembers.length);
		

		System.out.println("my family number one's age " + age[0]);
		System.out.println("my family number two 's age" + age[1]);
		System.out.println("my family number three 's age" + age[2]);
		
		// loops
		for(String fm : familyMembers) {
			System.out.println("My family member(s) are " + fm);
		}
		
		
	}

	private static void printMyAge(int age) {
		
		System.out.println("My age is " + age);
	}
	
	protected static void printSomeOtherAge(){
		printMyAge(ageGlobal);
		System.out.println("My age is " + ageGlobal);
	}
}
