package com.company;
class MyMainEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
    public int getId() {
        return id;
    }

    public MyMainEmployee(int myId,String myName){
        id = myId;
        name = myName;
    }
}
public class CWH_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee(12,"codeWithHaryy");
//        harry.setName("codewithharry");
//        harry.setId(34);

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
