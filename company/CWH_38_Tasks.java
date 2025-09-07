package com.company;

class EmployeeData {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public int setSalary(int num){
        salary=num;
        return salary;
    }
}

class cellPhone{
    public void ringing(){
        System.out.println("Ringing .....");
    }
    public void vibrating(){
        System.out.println("vibrating .....");
    }
    public void callfriend(){
        System.out.println("calling my friend ...");
    }
}

class Square {
    int side;
    public int area(){
        return  side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class CWH_38_Tasks {
    public static void main(String[] args) {
        EmployeeData harry = new EmployeeData();
        harry.setName("CodeWithHarry");
        harry.setSalary(2000);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

        cellPhone phone = new cellPhone();
        phone.callfriend();
        phone.vibrating();
        phone.ringing();

        Square sq = new Square();
        sq.side = 3;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
