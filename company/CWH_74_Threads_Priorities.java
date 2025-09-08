package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name) {
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you ..." + this.getName());
    }
}

public class CWH_74_Threads_Priorities {
    public static void main(String[] args) {

        //Ready Queue : T1, T2, T3, T4, T5

        MyThr1 T1 = new MyThr1("harry1");
        MyThr1 T2 = new MyThr1("harry2");
        MyThr1 T3 = new MyThr1("harry3");
        MyThr1 T4 = new MyThr1("harry4");
        MyThr1 T5 = new MyThr1("most importants");
        MyThr1 T6 = new MyThr1("harry6");
        MyThr1 T7= new MyThr1("harry7");
        MyThr1 T8= new MyThr1("harry8");
        MyThr1 T9= new MyThr1("harry9");

          T5.setPriority(Thread.MAX_PRIORITY);

                T1.start();
                T2.start();
                T3.start();
                T4.start();
                T5.start();
                T6.start();
                T7.start();


    }
}
