package com.mycompany.abstraction.abstractexample;

import java.io.File;
public abstract class AnimalAbstractClass {
	 String name;
	    
	    // Constructor (allowed in abstract class)
	    public AnimalAbstractClass(String name) {
	        this.name = name;
	    }
	    
	    // Abstract method (no implementation)
	    abstract void makeSound();
	    
	    // Non-abstract method with implementation
	    void eat() {
	        System.out.println(name + " is eating.");
	    }
	    
	    // Static block (allowed in abstract class)
	    static {
	        System.out.println("Static block in abstract class");
	    }
	    
	    // Non-static block (allowed in abstract class)
	    {
	        System.out.println("Non-static block in abstract class");
	    }
}

