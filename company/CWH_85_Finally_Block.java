package com.company;

public class CWH_85_Finally_Block {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("result : "+c);

        } catch (Exception e) {
            System.out.println("this is the error : "+ e.getMessage());;
        }finally {
            System.out.println("This is the end of this programs");
        }
    }
}
