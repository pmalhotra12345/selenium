package com.mycompany.abstraction.abstractexample;

import java.io.File;

/*
 * abstract class implies a tighter coupling between the base class and its subclasses compared to using an interface. Subclasses are required to extend the abstract class
 */
public class AnimalAbstractClassTest {
	public static void main(String[] args) {
		        Dog dog = new Dog("Max");
		        dog.makeSound();
		        dog.eat();
	}
}
