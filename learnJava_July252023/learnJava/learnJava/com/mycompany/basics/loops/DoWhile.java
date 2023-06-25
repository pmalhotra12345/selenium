package com.mycompany.basics.loops;

public class DoWhile {
	public static void main(String [] args)
    {   
      int num = 1;       
      do
        {
          System.out.println(num);
          num++;
        } while(num<=1); 
        System.out.println("After the end of do while loop");                   
     }
	
	/*
	 * When you know the code inside the loop should be executed for a fixed number of time, use for loop. 
	 * When you are not sure about repetition number, go for while loop, in this case 
	 * if you want that your code should be executed at least once, go for do while loop.
	 * 
	 */
}
