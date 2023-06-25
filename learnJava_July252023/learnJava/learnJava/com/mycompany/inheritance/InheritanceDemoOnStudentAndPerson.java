package com.mycompany.inheritance;

public class InheritanceDemoOnStudentAndPerson {

	public static void main(String args[]) {
		Student obj = new Student();
		System.out.println("Name : " + obj.name + ", age : " + obj.age + ", rollno : " + obj.rollno);
		obj.talk();
		obj.study();
		
		//Inheritance forms an inheritance hierarchy or a class hierarchy, where classes are organized in a tree-like structure based on their inheritance relationships. The hierarchy allows for polymorphism, where objects of different classes can be treated as objects of a common superclass.
	}

}
