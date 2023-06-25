package com.mycompany.classandobjects;

public class ClassDemo {

	public static void main(String[] args) {

		Person p1 = new Person(); // Creating instance of class Person
		p1.name = "Saranya";
		p1.age = 20;
		p1.height = 170;

		/*
		 * Person p2= new Person("Saranya",20,170);
		 */
		p1.walk();
		p1.talk();

		int i = 0;
		p1.walk1(i, "nothing"); // primitive int is being sent while the method signature takes
								// Integer.Autoboxing is applied by compiler

		Person.calculateArea(10, 10);

		System.out.println("Static variable " + Person.temporaryVariable);

	}

}
