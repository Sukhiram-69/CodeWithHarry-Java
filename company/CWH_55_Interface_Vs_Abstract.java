package com.company;

interface Bicycle{
    int a = 5;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHorn3g(int decrement);
    void speedUpmhn(int increment);
}
class AvanCycle implements Bicycle,HornBicycle{

    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }
   public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp");
    }

    public void blowHorn3g(int decrement){
        System.out.println("Applying Brake 3g");
    }
    public void speedUpmhn(int increment){
        System.out.println("Applying speedUp mhn");
    }
}

public class CWH_55_Interface_Vs_Abstract {
    public static void main(String[] args) {
    AvanCycle cycleHarry = new AvanCycle();
    cycleHarry.applyBrake(1);
    // You can create properties in interfaces
    System.out.println(cycleHarry.a);
    // You can not modify the properties in interfaces as they are finals
         //cycleharry.a = 454;
        System.out.println(cycleHarry.a);
    }
}
