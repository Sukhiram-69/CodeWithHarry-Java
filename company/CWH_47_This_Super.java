package com.company;

class This{
    public int x;

    public int getX() {
        return x;
    }

     This(int x) {
       this.x = x;
    }
}

class DoThis extends This{
    public DoThis(int x) {
        super(x);
        System.out.println("Main ek constructors hoon");
    }
}
public class CWH_47_This_Super {
    public static void main(String[] args) {
        This t = new This(6);
        DoThis demo = new DoThis(10);
        System.out.println(t.getX());
    }
}
