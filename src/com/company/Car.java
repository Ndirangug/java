package com.company;

public class Car {

    //data members or fields

    String model;
    String color;
    int numberOfDoors;
    boolean inMotion;
    int topSpeed;
    String type;

    //methods
    //syntax : AccessModifier, returnType, nameofmethod(parameter list){body}
    //private static int methodName(int a, int b){}

    public void setModel(String modelName){
        this.model = modelName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInMotion(boolean inMotion) {
        this.inMotion = inMotion;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void  display(){
        System.out.println("Colour:" +getColor() + " Top Speed:" + getTopSpeed() + " Model:" + getModel());
    }

    public static void main(String[] args) {
        //syntax of creating an object of a certain class
        //ClassName objectName  = new ClassName();
        Car toyota = new Car();
        Car mercedes = new Car();

       toyota.setModel("corrola");
       toyota.setColor("white");
       toyota.setInMotion(false);
       toyota.setTopSpeed(180);

       mercedes.setNumberOfDoors(4);
       mercedes.setTopSpeed(321);
       mercedes.setModel("AMG");

       toyota.display();
    }
}
