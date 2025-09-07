package com.company;

public class CWH_35_practice_set_on_methods {
//    static  void multplication(int n){
//        for (int i = 1; i<=12 ; i++){
//            System.out.format(" %d X %d = %d",n, i, n*i);
//            System.out.println("\n");
//        }
//    }

//    static void pattern(int n){
//    for (int i=0; i<n ; i++){
//        for (int j = 0; j<i+1; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//    }

    //sum(n) = n+sum(n-1);
    //sum(3) = 3+sum(3-1);
    // sum(2) = 2+sum(1) = 2+1=3
    // sum(3) = 3+2+1 = 6;


//    static  int sumRec(int n){
//        // Base Condition;
//
//        if(n == 1){
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }

    static  int fib(int n){
        if(n == 1 || n ==2){
            return n-1;
        }else{
         return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
//        multplication(7); // problems 01
//        pattern(9); // problems 02
        //int x = 10;
      // int c = sumRec(x);
       // System.out.format("sum of %d  is = %d\n",x,c);

//        for (int i=5;i>0; i--){
//            for (int j = 1; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // problem 05 fibonannci series 0,1,1,2,3

        int result = fib(5);
        System.out.println(result);
    }
}
