package com.mycompany.accessmodifier.testpackage;

import com.mycompany.accessmodifier.ProtectedMethodAndVariable;

// Accesibile by only inheritance
public class ProtectedMethodAndVariableTest extends ProtectedMethodAndVariable {
//public class ProtectedMethodAndVariableTest { // this gives compilation error as it is indifferent package and do not
												// extends
	public static void main(String[] args) {
		ProtectedMethodAndVariable obj = new ProtectedMethodAndVariable();
		//System.out.println(obj.protectedVariable); // Accessing the protected variable through inheritance
		//obj.protectedMethod(); // Accessing the protected method through inheritance
	}
}