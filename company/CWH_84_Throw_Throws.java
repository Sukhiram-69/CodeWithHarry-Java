package com.company;

class NegativeException extends Exception{

    public String toString(){
        return "Radius can not be negative";
    }

    public String getMessage(){
        return "Radius can not be negative";
    }

}

public class CWH_84_Throw_Throws {

    public static double area(int r) throws NegativeException{
        if(r<0){
            throw  new NegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a , int b) throws ArithmeticException{
       // Made by Harry
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
    // Shivam - uses divide function created by Harry

        try {
            int c = divide(6, 0);
            System.out.println(c);

            double ar = area(6);
            System.out.println(ar);

        }catch (Exception e){
            System.out.println("Exception");
        }


    }
}
