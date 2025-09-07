package com.company;

import java.util.Scanner;

public class CWH_Ch2_PS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter Your Chemestry marks : ");
        int chemestry = scan.nextInt();
        System.out.println("Enter Your Mathematics marks : ");
        int maths = scan.nextInt();
        System.out.println("Enter Your English marks : ");
        int eng = scan.nextInt();
        System.out.println("Enter Your Hindi marks : ");
        int hind = scan.nextInt();

        float percentage = ((physics + chemestry + maths + eng + hind)/500.0f)*100;

        System.out.println("percentage : " + percentage);

    }
}
