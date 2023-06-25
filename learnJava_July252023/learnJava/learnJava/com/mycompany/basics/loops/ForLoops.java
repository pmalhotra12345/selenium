package com.mycompany.basics.loops;

public class ForLoops {

	public static void main(String[] args) {
		String[] familyMembers = { "fm1","fm2","fm3"};
		int[] age ={10,11,12};
		
		
		//int[] age =new int[3];
		
		
		System.out.println("my family number one" + familyMembers[0]);
		System.out.println("my family number two" + familyMembers[1]);
		System.out.println("my family number three" + familyMembers[2]);
		//System.out.println("my family number three" + familyMembers[3]); // it will throw ArrayIndexOutOfBoundsException
		System.out.println("my array length is  " + familyMembers.length);
		

		System.out.println("my family number one's age " + age[0]);
		System.out.println("my family number two 's age" + age[1]);
		System.out.println("my family number three 's age" + age[2]);
		
		
		
		// enhanced loop
		for(String fm : familyMembers) {
			System.out.println("My family member(s) are with enhance for loop " + fm);
			for(int number : age) {
				System.out.println("My family member(s) are with enhance for loop " + number);
			}
		}

		
		for(int i=0 ; i < 3; i++) {
			System.out.println("index is " + i + "My family member(s) are with plain for loop " + familyMembers[i]);
			for(int j=0; j <3; j++) {
				System.out.println("My family member(s) are with plain for loop " + age[j]);
			}
			
			
		}
		// Printing A to Z
		char ch;
		for(ch = 'a';ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		
	}

}
