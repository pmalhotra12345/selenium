package com.mycompany.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to read a file that doesn't exist (FileNotFoundException)
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handling the checked exception (FileNotFoundException)
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

