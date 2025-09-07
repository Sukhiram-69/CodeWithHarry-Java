package com.company;

public class CWH_27_Arrays_Methods {
    public static void main(String[] args) {

        int [] arr = {98,45,79,99,80};
        float [] bucket = {88.3f,44.5f};
        String [] students = {"rahul","sonu","monu","golu"};
        System.out.println(arr.length);
        System.out.println(bucket.length);

        // array ascending order  using for loops

        for (int i = 0; i < students.length ; i++){
            System.out.println(students[i]);
        }

        // array use the descending order using the java
        System.out.println("printing reverse order loop : ");
        for (int i = students.length-1 ; i >= 0; i--){
            System.out.println(students[i]);
        }

    }
}
