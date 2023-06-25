package com.mycompany.inheritance;

// child class or sub class.
// Accesses all non-private fields and methods of parent
public class Child extends Parent {
    void subtract(int a, int b) {
      System.out.println(a +"-" +b+" = " +(a-b));
    }  
    
    void add(int a, int b) {
		System.out.println(a + "+" + b + " = " + (a + b + 5));
	}
 } 
