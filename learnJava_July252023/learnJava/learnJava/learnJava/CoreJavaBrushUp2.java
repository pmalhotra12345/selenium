package learnJava;
public class CoreJavaBrushUp2 {
public static void main(String[] args) {
			
			// TODO Auto-generated method stub
	//Java variables and Data types
	// Arrays , Initialize and retrieve values of array
	//Intro to For loop to iterate over array of Strings and Integers
	int k=1;
	for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
	{
	//System.out.println( "outer loop started");
	for(int j=1;j<=4-i;j++) // inner loop
	{
		System.out.print( k);
		System.out.print("\t");
		k++;
	}
	System.out.println( "");

	}
					
			
			
}
}
