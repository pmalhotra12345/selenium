package com.mycompany.learnjava.polymorphism;

public class RunTimePolymorphismDemoByPerson extends Person {
       
    public static void main(String [] args) {
      Teacher teacher = new Teacher(); // teacher object having it's own form
      teacher.name = "teacher Name";
      teacher.subject = "Math";     
      teacher.walk();
      teacher.talk();
      teacher.teach();
      
      if(teacher instanceof Teacher) {
    	  System.out.println("teacher is instance of Teacher");
      }
      
      Person person = teacher; // teacher object takes the form of person object
      person.walk();
      person.talk(); 
      //person.teach(); // Can't call teach method as it's not in Person class  
      
      if(person instanceof Teacher) {
    	  System.out.println("person is instance of Teacher");
      }
      else if(person instanceof Person) {
    	  System.out.println("person is instance of Person");
      } 
      
      Person person1 = new Person();
      person1.walk();
      
      if(person1 instanceof Teacher) {
    	  System.out.println("person1 is instance of Teacher");
      }
      else if(person1 instanceof Person) {
    	  System.out.println("person1 is instance of Person");
      } 
      
    }
 }
