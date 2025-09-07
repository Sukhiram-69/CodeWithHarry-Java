package com.company;

class  BaseA{
    public int x;
    public BaseA() {
        System.out.println(" I am base class constructors");
    }

    public BaseA(int a) {
        System.out.println(" i am an overloaded constructors with value of a : " + a);
    }

    public void setX(int x) {
        this.x = x;
    }
}

class DerivedA extends Base{

    public DerivedA(int x) {
        System.out.println(" I am derived class constructors");
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_46_Constructors_In_jInheritance {
    public static void main(String[] args) {
         //BaseA base = new BaseA();
        DerivedA derived = new DerivedA(5);

    }
}
