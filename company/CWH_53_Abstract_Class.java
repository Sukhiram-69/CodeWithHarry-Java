package com.company;
abstract class AnimalA {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
}

class DogA extends AnimalA {
    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark");
    }
}
public class CWH_53_Abstract_Class {
    public static void main(String[] args) {

        DogA d1 = new DogA();
        d1.makeSound();
        d1.eat();
    }
}
