package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_Ch7_Rock_Paper_Scrissor {
    public static void main(String[] args) {
        // 0 for the rock
        // 1 for the paper
        // 2 for scissors

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for rock , 1 for the paper , 2 for the scissors : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        } else if (userInput == 0 & computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput ==1) {
            System.out.println(" You Win");
        }else {
            System.out.println(" Computer Win");
        }

        if (computerInput == 0){
            System.out.println("computer choice : Rock");
        } else if (computerInput == 1) {
            System.out.println("computer choice : Paper");
        } else {
            System.out.println("computer choice : Scissors");
        }

    }
}