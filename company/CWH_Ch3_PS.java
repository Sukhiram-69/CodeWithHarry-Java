package com.company;

public class CWH_Ch3_PS {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypt the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

    }
}
