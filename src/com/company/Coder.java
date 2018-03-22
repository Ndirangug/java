package com.company;

public class Coder extends Employee {
    double bonus = 200000;


    public static void main(String[] args) {
        Coder coder = new Coder();
        System.out.println("Coder total salary is " +  (coder.salary += coder.bonus));
    }
}
