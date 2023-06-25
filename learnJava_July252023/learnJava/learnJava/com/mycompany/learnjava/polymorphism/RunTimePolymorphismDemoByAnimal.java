package com.mycompany.learnjava.polymorphism;

public class RunTimePolymorphismDemoByAnimal {
	public static void main(String[] args) {
		// Creating instances of Animal, Dog, and Cat
		// compiler treats them as instances of the Animal class
		Animal animal = new Animal();
		Animal dog = new Dog(); // Declaring Dog as Animal thats why only methods defined in Animal are accessible
		Animal cat = new Cat();

		/**
		 * When the makeSound() method is called, the appropriate implementation based
		 * on the actual object type is invoked at runtime. This provides flexibility
		 * and allows for code reuse and extensibility in object-oriented programming.
		 */

		// Calling makeSound() method on different objects
		animal.makeSound(); // Invokes makeSound() from Animal class
		dog.makeSound(); // Invokes overridden makeSound() from Dog class
		cat.makeSound(); // Invokes overridden makeSound() from Cat class

		 //dog.fetch(); // This line would result in a compilation error if uncommented

		 
		 Dog dog1 = new Dog();
		 dog1.fetch();
		/*
		 * Advantages:
		 * 
		 * Method Overriding: When we call dog.makeSound(), the overridden makeSound()
		 * method from the Dog class is invoked at runtime, printing "Dog is barking".
		 * This demonstrates that the appropriate method implementation is determined
		 * dynamically based on the actual object type (Dog in this case).
		 * 
		 * Flexibility and Extensibility: Since dog is declared as Animal, we are
		 * restricted to using only the methods and properties available in the Animal
		 * class. If we had declared Dog dog = new Dog();, we would have access to both
		 * the makeSound() method and the fetch() method. However, by declaring dog as
		 * Animal, we cannot directly invoke the fetch() method on the dog object. This
		 * restriction allows for flexibility in substituting different animal types
		 * without affecting the code that uses the Animal reference
		 * 
		 * 
		 */
	}
}
