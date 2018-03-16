package com.company;

public class DataTypes {
    public static void main(String[] args) {
        /*Primitive data types
        * int, double, charcter, float, boolean
        * Complex
        * String, Arrays
        * Declare a variable
        * 3 parts
        * type-required
        * varName-required
        * value-optional
        * */

        int myNum;
        myNum = 34;

        float num1 = 45, num2 = 23, num3 = 98;
        num1 = num2 / num3;

        System.out.println("the result of multiplying is " + num1);

        double d = 45.34343;
        float f = 34.1313f;
        char g = 'b';
        String name = "Georgeh";
        String another = new String("Hello");
        String s1 = "I have ";
        int cows = 89;
        System.out.println(name + " " + cows + " " + s1);

        boolean age = true;

        if (age){
            System.out.println("Qualified");
        }
        else {
            System.out.println("Go away");
        }

        boolean b;
        boolean toBe = false;
        b = toBe || !toBe;
        System.out.println(b);


    }
}
