package com.mycompany.learnjava.polymorphism;

public class Teacher extends Person{
	String subject;
	   
    void teach() {
      System.out.println("I am teacher for the subject: "+subject);
    } 
 }