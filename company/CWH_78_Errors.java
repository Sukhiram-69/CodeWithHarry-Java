package com.company;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CWH_78_Errors {
    public static void main(String[] args) {

        // LOGICAL ERROR DEMO

        // write a programs to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // RUN TIME ERROR

        try {

            int k;

            System.out.println("enter the numbers : ");
            Scanner scan = new Scanner(System.in);
            k = scan.nextInt();

            System.out.println("integers parts of 1000 divided by k is " + 1000 / k);

        } catch (Exception e) {
            System.out.println("Something went wroung , please try again later ");
        }
    }
}
