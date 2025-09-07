package com.company;

class MyThr extends Thread{
    public MyThr(String name) {
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you ...");
//        while (true){
//            System.out.println("i am threads");
//        }
    }
}
public class CWH_73_Thread_Constructors {
    public static void main(String[] args) {

        MyThr t = new MyThr("Harry");
        MyThr t2 = new MyThr("Harry Bhai");

        t.start();
        t2.start();

        System.out.println("the id of the thread t is : "+t.getId());
        System.out.println("the id of the thread t is : "+t.getName());

        System.out.println("the id of the thread t2 is : "+t2.getId());
        System.out.println("the id of the thread t2 is : "+t2.getName());
    }
}
