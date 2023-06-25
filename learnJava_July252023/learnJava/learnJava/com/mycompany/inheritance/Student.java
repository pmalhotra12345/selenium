package com.mycompany.inheritance;

//public class Student extends Person,Parent { // Multiple inheritance is not allowed in Java
public class Student extends Person {
	int rollno = 30;

	void study() {
		System.out.println("I am studying");
	}

	// The @Override annotation is used to indicate that a method is intended to
	// override a superclass method.
	@Override
	void talk() {
		System.out.println("I am studen(subclass). and i also can talk");
	}
}
