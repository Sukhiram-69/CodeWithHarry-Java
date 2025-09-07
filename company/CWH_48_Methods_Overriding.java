package com.company;
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}
public class CWH_48_Methods_Overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
    }
}
