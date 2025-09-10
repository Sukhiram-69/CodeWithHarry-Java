package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class CWH_81_Nested_Try_And_Catch {
    public static void main(String[] args) {

        int [] marks = new int[3];

        marks[0] = 7;
        marks[1] = 50;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag){

            System.out.println("Enter the value of index : ");

            int ind = sc.nextInt();

            try {

                System.out.println("welcome to videos no 82");
                try{

                    System.out.println(marks[ind]);
                }catch (ArrayIndexOutOfBoundsException e){

                    System.out.println("Sorry this index does not exist!");
                    System.out.println("exception in level 2");
                }
            }catch (Exception e){

                System.out.println("exception in level 1");
            }
        }
        System.out.println("thanks for the using the programs");
    }
}
