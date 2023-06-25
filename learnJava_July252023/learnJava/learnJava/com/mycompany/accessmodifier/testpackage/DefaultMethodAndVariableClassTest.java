package com.mycompany.accessmodifier.testpackage;

import com.mycompany.accessmodifier.DefaultMethodAndVariableClass;

public class DefaultMethodAndVariableClassTest {
	public static void main(String[] args) {
		DefaultMethodAndVariableClass obj = new DefaultMethodAndVariableClass();
	
		// Below two statements gives compilation error
		//System.out.println(obj.defaultVariable); // Accessing the default variable within the same package
		//obj.defaultMethod(); // Accessing the default method within the same package
	}
}
