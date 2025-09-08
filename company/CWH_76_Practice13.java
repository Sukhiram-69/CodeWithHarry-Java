package com.company;

class Practice13 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Good Morning.");
        }
    }
}

class Practice13b extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Welcome guys.");
        }
    }
}

public class CWH_76_Practice13 {

    public static void main(String[] args) {

    Practice13 p = new Practice13();
    p.setPriority(6);

    Practice13b p2 = new Practice13b();
    p2.setPriority(9);

    p.start();
    p2.start();

    }
}
