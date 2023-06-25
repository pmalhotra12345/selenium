package com.mycompany.learnjava.polymorphism;

//Child class inheriting from Animal
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Dog is barking");
 }
 public void fetch() {
     System.out.println("Dog is fetching a ball");
 }

}
