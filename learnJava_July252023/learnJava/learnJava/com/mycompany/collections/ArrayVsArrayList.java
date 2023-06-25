package com.mycompany.collections;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Limitation of Arrays: Fixed Size

        // Creating an array of size 5
        int[] numbers = new int[5];

        // Adding elements to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Attempting to add more elements beyond the array size
        // This will throw an ArrayIndexOutOfBoundsException
        // numbers[5] = 40;

        // Limitation of Arrays: Inflexible Size

        // Creating an ArrayList to overcome the limitations of arrays
        ArrayList<Integer> numberList = new ArrayList<>();

        // Adding elements to the ArrayList
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // Adding more elements dynamically
        numberList.add(40);
        numberList.add(50);

        // Accessing elements in the ArrayList
        int firstNumber = numberList.get(0);
        
        int ArrayListLength = numberList.size();
        
        int lastNumber = numberList.get(numberList.size() - 1);

        System.out.println("FirstNumber is: " + firstNumber + " Last number is : " + lastNumber + " Size is " + ArrayListLength);
        
        // Printing the elements
        System.out.println("ArrayList Elements:");
        for (int number : numberList) {
            System.out.println(number);
        }
        
        
        // Limitation of ArrayList: Slower Performance


        // Creating an ArrayList of strings
        ArrayList<String> namesList = new ArrayList<>();

        // Adding strings to the ArrayList
        namesList.add("John");
        namesList.add("Mary");
        namesList.add("Peter");


        // Searching for an element in the ArrayList
        int indexList = namesList.indexOf("Mary");

        // Printing the indexes
        System.out.println("Index of Mary in ArrayList: " + indexList);
    }

}

