package com.mycompany.inheritance;

//Parent class
class Vehicle {
	protected String brand;

	// Constructor
	public Vehicle(String brand) {
		super();
		// The this keyword is used to refer to the current instance of a class.
		this.brand = brand; // Observe the usage of This

	}

	// Method
	public void drive() {
		System.out.println("Driving the vehicle");
	}
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
	public static int numberOfDoors;

	// Constructor
	public Car(String brand, int numberOfDoors) {
		// This allows the Car class to utilize the initialization logic defined in the
		// Vehicle class constructor before executing its own code.
		super(brand); // Invoking the superclass constructor using 'super'
		this.numberOfDoors = numberOfDoors;
	}

	// Method overriding the drive() method in the superclass
	@Override
	public void drive() {
		super.drive();
	}

	// Method specific to the Car class
	public void honk() {
		System.out.println("Honking the horn");
	}
}

public class InheritanceDemoByVehicle {
	public static void main(String[] args) {
		
		int y = Car.numberOfDoors;
		
		// Creating an instance of the Car class
		Car myCar = new Car("Toyota", 4);
		
		int x = myCar.numberOfDoors;

		// Accessing inherited member from the Vehicle class
		//System.out.println("Brand: " + myCar.brand);

		// Invoking overridden method in the Car class
		myCar.drive();

		// Accessing a method specific to the Car class
		myCar.honk();
	}
}
