//You can learn more about Access modifiers in java from below link
//http://www.javatpoint.com/access-package coreJava;

package learnJava;

public class constructDemo2 { 	
			
	//	// Default 
	public void constructDemo2() 
	{ 
	System.out.println(" I am in the constructor"); 
	System.out.println(" I am in the constructor lecture 1"); 
	// 
		
	} 
	
	// Parameterized constructor 
	public constructDemo2(int a, int b) 
	{ 
	System.out.println(" I am in the parameterized constructor");
	int c=a+b;
	System.out.println(c); 
	} 
	
//	public constructDemo2(String str)
//	{ 
//	System.out.println(str);
//	} 
//	public void getdata() 
//	{
//		System.out.println("I am the method");
//	} //will not return values //name of constructor should be the class name



public static void main(String[] args) { 
	// TODO Auto-generated method stub
	//constructDemo2 cd= new constructDemo2(); 
	
	
//	constructDemo2 cds= new constructDemo2("hello");
    constructDemo2 c= new constructDemo2(4,5); 
	// compiler will call implict constructor if you have not defined constructor block 
	//when ever you create an object constructor is called
	//block of code when ever an object is created 
	}

}
