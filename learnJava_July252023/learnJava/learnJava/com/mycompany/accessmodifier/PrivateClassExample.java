package com.mycompany.accessmodifier;

public class PrivateClassExample {
//private class PrivateClassExample { // this will give error as the main class should always be public/abstract/final
	private class PrivateInnerClass {  // Inner class can be private
        // Inner class members and methods...
    }
	
	 public static void main(String[] args) {
		 PrivateClassExample outer = new PrivateClassExample();
	        PrivateInnerClass inner = outer.new PrivateInnerClass(); // Accessing private inner class within the same enclosing class
	    }
}


class AnotherClass {
    public static void main(String[] args) {
    	PrivateClassExample outer = new PrivateClassExample();
        // PrivateInnerClass inner = outer.new PrivateInnerClass(); // Compilation error - PrivateInnerClass is not accessible here
    }
}