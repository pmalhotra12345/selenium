package com.mycompany.collections;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicCollections {
    public static void main(String[] args) {
        // Set Example: HashSet

        // Creating a HashSet to store unique elements
        Set<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Adding a duplicate element, which will be ignored
        fruits.add("Apple");

        // Printing the elements in the HashSet
        System.out.println("Fruits in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // HashMap Example

        // Creating a HashMap to store key-value pairs
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentScores.put("John", 90);
        studentScores.put("Mary", 85);
        studentScores.put("Peter", 92);

        // Updating the score for an existing key
        studentScores.put("John", 95);

        // Accessing the value associated with a key
        int johnScore = studentScores.get("John");

        // Printing the key-value pairs in the HashMap
        System.out.println("\nStudent scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }
    }
}

