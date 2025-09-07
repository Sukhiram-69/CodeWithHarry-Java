package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" I am base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am Constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_Inheritence {
    public static void main(String[] args) {
        // Creating an object of base class
        Base base = new Base();
        base.setX(4);
        System.out.println("base class value "+ base.getX());

        // creating an object of derive class
        Derived derive = new Derived();
        derive.setY(8);
        System.out.println("drive class value "+ derive.getY());

    }
}
