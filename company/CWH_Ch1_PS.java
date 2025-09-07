package com.company;

import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
        // Problem 01

        int a = 4;
        int b = 17;
        int c = 6;
        int sum = a+b+c;

        // problem 02
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;

        float cgpa = (subject1 + subject2 + subject3)/30;

        // Problems 03

        System.out.print("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");

        // Problem 04 Kilo Meter to Mile conversions

        System.out.print("enter km value : ");
        Scanner scs = new Scanner(System.in);
        int km = scs.nextInt();
        double mile = km * 0.621371;

        // Problem 05

        System.out.print("enter a number : ");
        Scanner scsc = new Scanner(System.in);
        boolean numb = scsc.hasNextInt();

        System.out.println( km +" Km to Mile conversions value : " + mile);

        System.out.println("CGPA is " + cgpa);
        System.out.println("Sum of three numbers : " + sum);
        System.out.print("number is int : " + numb);

    }
}
