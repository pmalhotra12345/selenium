package com.mycompany.classandobjects;
//class defines a set of properties and methods that the objects can have
public class Person {

	public static String favouriteHobby = "timeWaste";
	// Instance variables, describes state/properties of object of this class.
	String name;
	int age;
	int height;

	
	/**
	 * Default constructor gets created by compiler only if there is no constructor
	 * defined at all. If we created only all arg constructor default constructor is
	 * not created by compiler
	 */
	// Default constructor
	Person() {
		// Initialization code
	}

	// All Argument constructor
	public Person(String n, int a, int h) {
		System.out.println("Initialization using parameterized constructor");
		age = a;
		height = h;
		name = n;
	}

	// methods, describes behaviors of object of this class.
	public void walk() {
		System.out.println(
				"Hello : " + name + ", your age : " + age + " year," + " height : " + height + " cm. I can Walk");
	}

	public void walk1(Integer i , String j) {
		System.out.println(
				"Hello : " + name + ", your age : " + age + " year," + " height : " + height + " cm. I can Walk");
		System.out.println("First argument" + i  + "second argument: " + j);
	}
	
	public void talk() {
		System.out.println(
				"Hello : " + name + " your age : " + age + " year," + " height : " + height + " cm. I can Talk");
	}

	public void eat() {
		System.out.println(
				"Hello: " + name + " your age : " + age + " year," + " height : " + height + " cm. I can Eat");
	}

	public static void calculateArea(int length, int width) {
		int area = length * width;
		System.out.println("Area = " + area);
	}

	protected static int temporaryVariable = 10;
}
