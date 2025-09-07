package com.company;
class Employee{
    int id;
    String name;
    public void employeeDetails(){
        System.out.println("Employee Id is : "+id);
        System.out.println("Employee name is : "+name);
    }
}
public class CWH_36_Class_And_Objects {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee obj =  new Employee(); // instantiaiting a new employee object
        Employee obj2 =  new Employee(); // instantiaiting a new employee object

        // Setting Attributes
        obj.id=12;
        obj.name="Sukhiram Sahu";
        obj2.id=13;
        obj2.name="Sukhi Sahu";
//        System.out.println("Employee name : " + obj.name);

        //printing the employeedetails
        obj.employeeDetails();
        obj2.employeeDetails();
    }
}
