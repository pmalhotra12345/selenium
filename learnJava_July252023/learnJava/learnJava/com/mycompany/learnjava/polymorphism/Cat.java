package com.mycompany.learnjava.polymorphism;

//Child class inheriting from Animal
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat is meowing");
 }
}