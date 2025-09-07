package com.company;

class MyThread extends Thread{
    public void run(){
        int i = 0;

        while (i < 40000){
            System.out.println("my cooking thread is running");
            System.out.println("i am happy");
            i++;
        }

    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;

        while (i < 40000){
            System.out.println("thread2 for chatting with her");
            System.out.println("i am sad");
            i++;
        }

    }
}

public class CWH_70_Multithreading {
    public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread2 t2 = new MyThread2();

    t1.start();
    t2.start();

    }
}
