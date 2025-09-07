package com.company;

class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");
        System.out.println("i am a thread1 not a threat1");

    }

   
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");
        System.out.println("i am a thread 2 not a threat2");

    }
}

public class CWH_71_Runnable_Interface {

    public static void main(String[] args) {

        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
