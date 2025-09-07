package com.company;

abstract class Pen{

    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("write a code");
    }
    void refill(){
        System.out.println("write a refill code");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping the monkey");
    }
    void bite(){
        System.out.println("bite the monkey");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello Sir !");
    }

    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class CWH_60_cp11ps {
    public static void main(String[] args) {

        // Q1 + Q2
    FountainPen pen = new FountainPen();
    pen.changeNib();

    // Q3

        Human harry = new Human();
        harry.sleep();

        // Q5

        Monkey monkey = new Human();
       // monkey.speak();  ---> Can not use speak methods because the refrence is monkey which does not have speak methods
        monkey.jump();
        monkey.bite();

        BasicAnimal lavish = new Human();
       // lavish.speak();  ---> Error
        lavish.eat();
        lavish.sleep();

    }
}
