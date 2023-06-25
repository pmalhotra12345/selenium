package com.mycompany.solutions.day4;

public class RunTimePolymorphism {

	
	class Animal {
	    public void makeSound() {
	        System.out.println("Animal is making a sound");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Meow! Cat is making a sound");
	    }
	}
}
