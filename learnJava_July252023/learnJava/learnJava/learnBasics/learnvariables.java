package learnBasics;

public class learnvariables {
	
	public static void main(String[] args) {
		
		//Integer 
		int a = 8;
		int b = 6;
		int c;
		c = a+b;
		System.out.println("The sum of a and b is " +c);
		
		//if else 
		if (c>15) {
			System.out.println("c is greater than 15");
		}
		else {
			System.out.println("c is less than 15");
		}
		
		//for loop
		//for iteration 0
		
		for (int i = 0;i<10;i++) {
			System.out.println("Hello");
		}
			
		//string variables
//		char c1 = 'k';
//		String g = "My name is Pushpinder";
//		System.out.println("I want to print my name and here you go" + g);
			
		
		
	      int one = 20;  
	      // declaring multiple variable
	      int two = 30, three = one, four; 
	      three = one + b;
	      System.out.println("d = " + three);
	      
	      //int a = 20 // missing semicolon(;) at the end. Correct is ->  int a = 20; 
	    	//	  int b c; // two variables must be separated by comma(,) if declared in same line. Correct is -> int b, c;
	    	//	  int d = 20.5; // Can't assign float value in int data type
	    	//	  int p, int q; // Correct is -> int p; int q;  or int p, q;
	    	//	  int p = int q; // Right side of = operator must be an expression or value, not variable declaration
		
	      
	    //Calling of method
			
			learnvariables myObj = new learnvariables ();
			myObj.myMethodforChars();
		
	}
	
	//Defintion of method
	public  void myMethodforChars() {
		char c1 = 'k';
		String g = "My name is Pushpinder";
		System.out.println("I want to print my name and here you go" + g);
	}

}
