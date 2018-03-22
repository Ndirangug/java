package com.company;

public class Bike extends Vehicle {
    String modelType;
    public void showDetails(){
        System.out.println("Model Type: " + this.modelType + "\nVehicle Type: " + this.vehicleType);
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public static void main(String[] args) {
        Bike georges = new Bike();
        georges.setModelType("BMX");
        georges.setVehicleType("Leisure");
        georges.showDetails();
    }
}


