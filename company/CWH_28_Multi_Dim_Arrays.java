package com.company;

public class CWH_28_Multi_Dim_Arrays {
    public static void main(String[] args) {
        int [] marks ; // A 1-D Arrays
        int [][] flats; // A 2-D Arrays

        flats = new  int[2][3];

        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;

        flats[1][0]=103;
        flats[1][1]=104;
        flats[1][2]=105;

        // Displaying the 2-D Arrays  ( for loop )

        System.out.println("Printing a 2-D Arrays using for loops \n");
        for (int i=0; i<flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
