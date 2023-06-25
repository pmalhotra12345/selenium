package com.mycompany.accessmodifier;


public class DefaultClassModifierTestFromSamePackage {
	public static void main(String[] args) {
		
		
		/*
		 * Below is accesibile
		 */
		
		
		DefaultModifier1 dmf = new DefaultModifier1();  
        dmf.printMessage();                           
        System.out.println("count = "+dmf.count);
     
	}
}
