package com.company;


import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString";
    }

    public String getMessage(){
        return " I am getMessage";
    }

}
public class CWH_83_Exception_Class {
    public static void main(String[] args) {
        int a = 8;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        if (a < 9){

            try{
                throw  new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
