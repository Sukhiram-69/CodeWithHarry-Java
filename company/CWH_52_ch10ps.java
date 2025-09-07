package com.company;

class  CircleA{
    public int radius;
    public float area(){
        System.out.println(" i am circle parameterized constructers");
        return (float) (Math.PI*this.radius*this.radius);
    }
     CircleA(){
         System.out.println(" i am circle class constructor without parameters");
     }
     CircleA(int r) {
         System.out.println("i am circle parameterize constructors");
        this.radius = r;
    }
}

class CylinderA extends CircleA{
public int height;

    public CylinderA(int r, int height) {
        super(r);
        System.out.println("i am cylenderA class contructors");
        this.height = height;
    }

    public double volume(){
    return Math.PI*this.radius*this.radius*this.radius;
}
}
public class CWH_52_ch10ps {
    public static void main(String[] args) {
    // problems 01

    CylinderA cylender = new CylinderA(13,15);

    }
}
