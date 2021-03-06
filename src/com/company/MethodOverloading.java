package com.company;

public class MethodOverloading {

    //Method overloading is a feature that allows a class to have two or more methodshaving the same name provided that thre argument lists are differenr
    /*
    * the argument could differ by
    * 1.Numbe of parametrs
    * 2.Data type of parametres
    * 3.Sequence of parametrs*/

    //overloading based on number of parameters
    public void print(char d){
        System.out.println(d);
    }


    public void print(char d, String name){
        System.out.println("Your name is " + name + " and you scored grade " + d);

    }

    public void print(int age){
        if (age < 18){
            System.out.println("Not yet legal");
        }else {
            System.out.println("Welcome to AdultHood");
        }
    }

    //overloading based on datatypes
    public void print(String location, int num){
        System.out.println("First Definition");
    }

    public void print(int num, String location){
        System.out.println("Second definition");
    }

    public static void main(String[] args) {
        //Class name objectName = new Classname();
        MethodOverloading overload = new MethodOverloading();
        overload.print(18);
    }
}
