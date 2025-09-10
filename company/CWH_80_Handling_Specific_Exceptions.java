package com.company;

import java.util.Scanner;

public class CWH_80_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks = new int[3];

        marks[0] = 7;
        marks[1] = 50;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.println("enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {

            System.out.println("The value at array index entered is : "+marks[ind]);
            System.out.println("the value of array-value/number is : " + marks[ind]/number);

        }catch (ArithmeticException e){

            System.out.println("ArithmeticException exception occured!");
            System.out.println(e);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException exception occured!");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }

    }
}
