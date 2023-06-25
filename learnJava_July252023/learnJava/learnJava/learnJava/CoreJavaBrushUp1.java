package learnJava;
public class CoreJavaBrushUp1 {
public static void main(String[] args) {
			
			// TODO Auto-generated method stub
	//Java variables and Data types
	// Arrays , Initialize and retrieve values of array
	//Intro to For loop to iterate over array of Strings and Integers
	
					
			
			
			int myNum = 5;
			
			String website = "Tech Learning Canada";
			
			char letter = 'r';
			
			double dec = 5.99;
			
			boolean myCard = true;			
			
			
			System.out.println(myNum+"is the value stored in the myNum variable");
			
			System.out.println(website);
			
			//Arrays -
			
		//	int[] arr2 = {1,2,4,5,6};	
			
			
			int [] myArray = new int[3];
			myArray[0] = 1;
			myArray[1] = 2;
			myArray[2] = 3;
			
			int lengthofarray = myArray.length;
			System.out.println("lengthofarray" + lengthofarray);
			System.out.println("myArray[0] " + myArray[0] );
			
			for (int k =0;k< lengthofarray;k++) {
				System.out.println("myArray[k]" + myArray[k]);
			}

			
			int[] arr = new int[5];// 5, 10
			
			arr[0] = 1;
			
			arr[1] = 2;
			
			arr[2]= 4;
			
			arr[3]= 5;
			
			arr[4]= 6;								
			
			
			int[] arr2 = {1,2,4,5,6};			
			
			
			System.out.println(arr2[0]);				
				
			//for loop arr.length - 5
			
			for(int i = 0; i< arr.length; i++) //4
			
			{
			
			
			
			System.out.println(arr[i]);
			
			}
			
			
			
			for (int i =0;i<arr2.length; i++)
			
			{
			
			System.out.println(arr2[i]);
			
			}
			
			
			
			String[] name = {"rahul", "shetty", "selenium"};
			
			
			
			for(int i =0; i<name.length;i++)
			
			{
			
			System.out.println(name[i]);
			
			}
			
			
			
			for( String s: name)
			
			{
			
			System.out.println(s);
			
			}
			


		}

}
