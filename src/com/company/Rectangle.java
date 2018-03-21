package com.company;

public class Rectangle {
    //Fields
    int length, width;

    //method
    //accessModifier returnType methodName(parameter list){//method body}
    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle garden = new Rectangle();
        System.out.println(garden.calculateArea(2, 4));
    }
}