package com.company;

public class CWH_34_Recursion {
    static int factorial(int n){
        if(n == 1 || n == 0){
            return  1;
        }else {
           // return n*factorial(n-1);
            int product = 1;
            for (int i = 1; i<=n; i++){
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println("the value of factorial x is : " + factorial(x));
    }
}
