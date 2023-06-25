package com.mycompany.autounboxing;

public class PrimitiveConversions {

	public static void main(String[] args) {
		// Some primitives. Less bit, less memory

		byte age = 25; // 8-bit(1 byte) integer value.Range: -128 to 127
		short temperature = -10; // 16-bit(2 byte) integer value. Range: -32,768 to 32,767
		int count = 1000; // 32-bit(4 bytes) integer value. Range: -2,147,483,648(-2 billion) to
							// 2,147,483,647(+ 2 billion)
		long population = 7823456789L; // 64-bit(8 bytes) integer value. Range: -9 quintillion to +9 quintillion. L
										// indicates long

		float pi = 3.14f; // Represents a single-precision 32-bit decimal.
		double distance = 1500.75; // double-precision 64-bit floating-point value
		char grade = 'A'; // single 16-bit Unicode character
		boolean isActive = true;

		// int and long are used for representing whole numbers, with long having a
		// wider range than int. float and double are used for representing decimal
		// numbers, with double providing higher precision and a wider range than float

		//
		String str = "100";
		String str2 = "100.5";
		int i = Integer.parseInt(str);
		

		System.out.println(Integer.parseInt("hundered")); // will get number format exception
		
		double d = Double.parseDouble(str2);
		System.out.println("int value: " + i + ", double value: " + d);
		// Converting integer value to string
		String str3 = Integer.toString(i);
		System.out.println("String value: " + str3);
		
		int intValue = (int) d;
		
		double doubleValue = (double) intValue;

		System.out.println("Original int value: " + intValue);
		System.out.println("Converted double value: " + doubleValue);

		float floatValue = 3.14f;
		double doubleValue1 = (double) floatValue;


	}

}
