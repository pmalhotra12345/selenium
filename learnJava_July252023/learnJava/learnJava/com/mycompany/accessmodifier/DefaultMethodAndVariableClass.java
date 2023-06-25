package com.mycompany.accessmodifier;
//also known as package-private access
//no explicit access modifier is specified for a class, method, or variable
//accesibile within the package
public class DefaultMethodAndVariableClass {
	int defaultVariable = 10;

    void defaultMethod() {
        System.out.println("This is a default method in ClassA.");
    }
}
