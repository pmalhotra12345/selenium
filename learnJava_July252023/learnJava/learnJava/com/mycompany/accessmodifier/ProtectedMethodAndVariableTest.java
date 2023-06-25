package com.mycompany.accessmodifier;

import com.mycompany.accessmodifier.ProtectedMethodAndVariable;

// Here within the package protected variable and methods are accesibile wihtout even extending the class
public class ProtectedMethodAndVariableTest {
    public static void main(String[] args) {
    	ProtectedMethodAndVariable obj = new ProtectedMethodAndVariable();
        System.out.println(obj.protectedVariable); // Accessing the protected variable through inheritance
        obj.protectedMethod(); // Accessing the protected method through inheritance
    }
}