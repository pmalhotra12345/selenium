package com.mycompany.solutions.day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        
        Collections.reverse(names);
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
