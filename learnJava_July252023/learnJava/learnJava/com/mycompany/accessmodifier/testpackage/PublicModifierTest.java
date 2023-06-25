package com.mycompany.accessmodifier.testpackage;

import com.mycompany.accessmodifier.PublicModifier;

public class PublicModifierTest {
	public static void main(String [] args) {                
	       PublicModifier pmf = new PublicModifier();                             
	       pmf.printMessage();
	       System.out.println("count = "+pmf.count);           
	    }
	

}
