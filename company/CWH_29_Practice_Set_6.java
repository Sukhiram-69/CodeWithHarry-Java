package com.company;

public class CWH_29_Practice_Set_6 {
    public static void main(String[] args) {
        // Practice Problem 01

         /* float [] marks = new float[]{1.5f, 1.5f, 1.5f, 1.5f, 3.0f};
        float sum = 0;

        for (float element : marks){
            sum+=element;
        }
        System.out.println("the value of sum is : " + sum); */

        // Practice Problem 02

        float [] marks = new float[]{1.5f, 1.5f, 1.5f, 1.5f, 3.0f};
        float num = 3.0f;
        boolean isInArray = false;

        for (float element : marks){
           if (num == element){
               isInArray = true;
               break;
           }
        }
        if (isInArray){
            System.out.println("the value is present in the arrays");
        }else {
            System.out.println("the value is not present in the arrays");
        }
    }
}
