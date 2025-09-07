package com.company;

import java.util.Scanner;

public class CWH_05_taking_user_inputs {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int a = sc.nextInt();

        System.out.print("Enter the number 2 :");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.print("the sum of these numbers are :");
        System.out.print(sum);
    }
}
