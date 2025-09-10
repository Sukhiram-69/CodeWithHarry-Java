package com.company;

public class CWH_79_Try_And_Catch {

    public static void main(String[] args) {

        int a = 6000;
        int b = 0;

        try {

            int c = a / b;

            System.out.println("the result is " + c);

        }catch (Exception e){
            System.out.println(" we failed to divide. Reason : ");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the programs");
    }
}
