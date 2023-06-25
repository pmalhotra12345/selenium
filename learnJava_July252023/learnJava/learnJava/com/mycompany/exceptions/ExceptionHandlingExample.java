package com.mycompany.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            // Opening a file for reading using FileReader (checked exception)
            FileReader fileReader = new FileReader("input.txt");
            bufferedReader = new BufferedReader(fileReader);

            // Reading the first line from the file
            String line = bufferedReader.readLine();

            // Performing division by zero (unchecked exception)
            int result = 10 / 0;

            // Displaying the read line
            System.out.println("First Line: " + line);
        } catch (IOException e) {
            // Catching and handling checked exception (IOException)
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catching and handling unchecked exception (ArithmeticException)
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } finally {
            // Code inside the 'finally' block will always execute, regardless of exceptions
            System.out.println("Inside the 'finally' block.");

            try {
                // Closing the resources (try-with-resources)
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }

        System.out.println("End of the program.");
    }
}
