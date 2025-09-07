package com.company;

interface sampleInterface{
    void math1();
    void math2();
}

interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}

class MySampleClass implements childSampleInterface{
   public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}
public class CWH_58_Inheritance_Interface {
        public static void main(String[] args) {

            MySampleClass mySampleClass = new MySampleClass();
            System.out.println("java inheritance && interface lectures");
            System.out.println("");

            mySampleClass.math1();
            mySampleClass.math2();
            mySampleClass.math3();
            mySampleClass.math4();

        }
}
