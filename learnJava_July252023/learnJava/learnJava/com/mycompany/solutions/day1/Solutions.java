package com.mycompany.solutions.day1;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        // Exercise 1: Perform arithmetic operations and print the results
        int num1 = 10;
        int num2 = 5;
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
        // Exercise 2: Calculate average of three numbers
        double average = calculateAverage(5, 10, 15);
        System.out.println("Average: " + average);
        
        // Exercise 3: Determine message based on age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
        
        // Exercise 4: Determine day of the week
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        
        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input.");
        }
    }
    
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
