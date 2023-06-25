package com.mycompany.autounboxing;

/**
 * inbuilt classes corresponding to each primitive type that can be used to
 * convert these value types in object types
 * 
 * Primitives advantages: effective memory usage and performance<br>
 * Wrapper advantages : + can hold null while primitives can not be null <br>
 * &nbsp + collections like arraylist,hasmap stores only wrappers but not int
 * 
 * 
 * @author user
 * 
 *         Primitive Type | Wrapper Class<br>
 *         ===================================<br>
 *         byte 			Byte <br>
 *         short 			Short<br>
 *         int 				Integer<br>
 *         long 			Long<br>
 *         float 			Float<br>
 *         double 			Double<br>
 *         char 			Character<br>
 *         boolean			Boolean<br>
 *         ===================================<br>
 */
public class WrapperClass {

	public static void main(String[] args) {
		int i = 10;
		double d = 13.5;

		/**
		 * Primitives to wrapper objects
		 * =============================================================================
		 */
		// First way to convert primitives into objects
		Integer intObj = new Integer(i);
		Double doubleObj = new Double(d);
		System.out.println("========wrapper objects======");
		System.out.println("Integer : " + intObj + ", Double object : " + doubleObj);
		// Second way to convert primitives into objects
		Integer intObj2 = Integer.valueOf(i);
		Double doubleObj2 = Double.valueOf(d);
		System.out.println("intObj2 : " + intObj2 + ", doubleObj2 : " + doubleObj2);

		// Third way to convert primitives into objects
		// Autoboxing(you can directly assign primitves to objects) : Converting
		// primitives into objects
		Integer intObj3 = i;
		Double doubleObj3 = d;
		System.out.println("intObj3 : " + intObj3 + ", doubleObj3 : " + doubleObj3);

		/**
		 * wrapper objects to primitives
		 * =============================================================================
		 */
		// First way to Converting the wrapper object to primitive
		int in = intObj.intValue();
		double db = doubleObj.doubleValue();
		System.out.println("========Printing primitve values======== ");
		System.out.println("int: " + in + ", double:" + db);
		// Unboxing : second way to Converting the wrapper object to primitive
		int in2 = intObj;
		double db2 = doubleObj;
		System.out.println("int: " + in2 + ", double: " + db2);
	}
}
