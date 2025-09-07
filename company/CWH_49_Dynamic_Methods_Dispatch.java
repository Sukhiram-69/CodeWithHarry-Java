package com.company;
class  Phone{

    public void greet(){
        System.out.println("good Morning");
    }
    public void on(){
        System.out.println("My name is java");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka Swagat Hai");
    }
    public void name(){
        System.out.println("My Name is java and class is two");
    }
}
public class CWH_49_Dynamic_Methods_Dispatch {
    public static void main(String[] args) {
       // Phone phone = new Phone();
       //phone.name();

        Phone obj = new SmartPhone();
        obj.greet();
        obj.on();
    }
}
