package com.mycompany.abstraction.abstractexample;
import java.io.File;
public class Dog extends AnimalAbstractClass {
	
	
	// must define constructor
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// Implementation of abstract method
    void makeSound() {
        System.out.println(name + " is barking.");
    }
}
