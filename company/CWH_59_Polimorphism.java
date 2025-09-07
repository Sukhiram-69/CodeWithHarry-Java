package com.company;

interface MyCamera2{

    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectNetworks(String network);
    String callNumber(String number);
}

class MyCellPhones implements MyCamera2,MyWifi{

    public void recordVideo(){
        System.out.println("recording a video");
    }
    public void takeSnap(){
        System.out.println("taking snap..");
    }

    public String[] getNetworks() {
        System.out.println("Getting List Of Networks");
        String[] networkList = {"harry", "sukhi", "ram"};
        return networkList;
    }


    public void connectNetworks(String network){
        System.out.println("Connecting to " + network);
    }

    public String callNumber(String number) {
        System.out.println("Calling to .. " + number);
        return number;  // returning the number you passed
    }

    public void sampleMath(){
        System.out.println("This is Sample Math");
    }

}
public class CWH_59_Polimorphism {
    public static void main(String[] args) {
      MyCamera2 cam1 = new MyCellPhones();  //  This is a smartphone but , use it as a camera

         // cam1.getNetworks();  ---> Not allowed
        // cam1.sampleMath();   ---> Not allowed
         cam1.record4KVideo();

        MyCellPhones smartPhone = new MyCellPhones();
        smartPhone.sampleMath();
       // smartPhone.recordVideo();
        String[] networks = smartPhone.getNetworks();
        for (String net : networks) {
            System.out.println(net);
        }
        smartPhone.callNumber("9340769116");
    }
}
