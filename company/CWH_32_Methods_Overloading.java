package com.company;

public class CWH_32_Methods_Overloading {
    static  void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro!");
    }
    static void foo(int a, int b) {
        int c = a + b;
        System.out.printf("Sum of %d and %d is %d", a, b, c);
    }

    public static void main(String[] args) {
     foo();
     foo(30);
     foo(100,200);
    }
}
