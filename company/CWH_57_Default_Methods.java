package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("rcording in a 4k videos");
    }
}

interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("taking snap");
    }

    public void recordVideo(){
        System.out.println("record videos");
    }

    public String[] getNetworks(){
        System.out.println("Setting List of networks");
        String[] networkList = {"harry","prashant","sukhi"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to the " + network);
    }


}
public class CWH_57_Default_Methods {
    public static void main(String[] args) {
    MySmartPhone phone = new MySmartPhone();
    String[] arr = phone.getNetworks();
    }
}
