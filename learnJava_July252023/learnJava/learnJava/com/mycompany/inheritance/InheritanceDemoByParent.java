package com.mycompany.inheritance;

// Inheritance is achieved by extends
// Give code re-usability
// implements is-a relationship
public class InheritanceDemoByParent{
	public static void main(String args []) {
		// created the instance of child class still parent class method is accesible because of inheritance
	    Child obj = new Child();
	    obj.add(5,10);
	    System.out.println(obj.message);
	    obj.subtract(20,10);
	    
	    
	    // This method is not accesible becuase it is private method
	    //obj.multiply(30,20);
	    
	    // This method is not accesible becuase it is protected method
	    obj.modulus(30,20);
	  }  
}


 
 
 
