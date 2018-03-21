package com.company;

public class Student {
    //constructors are special methods that are called when an object is instantiated
    //a constructor initializes the newly created object
    String name;
    int id;

    Student(String initialName, int initialID){
       this.name = initialName;
       this.id = initialID;
    }

    void display(){
        System.out.println("Hi " + this.name + ", Your id is " + this.id);
    }

    public static void main(String[] args) {
        Student george = new Student("George", 23);
        george.display();

        Student ndanu = new Student("Ndanu", 1354574);
        Student mutavi = new Student("Mutavi", 8741534);
        ndanu.display();
        mutavi.display();
        
    }
}
