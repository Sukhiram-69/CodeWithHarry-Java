package com.company;

class Cylinder{

    private int radius;
    private int height;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
    public int getHeight() {
        return height;
    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class CWH_44_exercises {

    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12,9);
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
//
//        // problems 01
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
//
//        // Problems 02
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

        //Problem 03
        
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}
