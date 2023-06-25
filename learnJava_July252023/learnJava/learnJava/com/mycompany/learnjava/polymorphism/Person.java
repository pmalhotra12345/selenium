package com.mycompany.learnjava.polymorphism;

public class Person {
    String name;
   
    protected void walk() {
      System.out.println("My name is "+ name+ " and I can walk");
    }
    void talk() {
      System.out.println("My name is "+ name+ " and I can talk");
    }
 }