package com.company;

import javax.swing.*;

public class Calculator {

    public double multiply(double a, double b){
        return a * b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public double remainder(double a, double b){
        return a % b;
    }

    public static void main(String[] args) {
        

        for (int carryOn = 0; carryOn == 0;  carryOn = JOptionPane.showConfirmDialog(null,"Do you wish to perform another calculation?(yes/no)")) {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter your first value"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter your second value"));
            String c;

            String operation = JOptionPane.showInputDialog("What opertation do yoy wish to carry out?(add, multiply, subtract, divide, find remainder");

            Calculator calculator = new Calculator();

            switch (operation){
                case "add":
                    c = "The result of adding " + a + " and " + b + " is " + calculator.add(a, b);
                    break;

                case "subtract":
                    c = "The result of subtarcting " + b + " from " + a + " is " + calculator.subtract(a, b);
                    break;

                case "multiply":
                    c = "The result of multiplying " + a + " and " + b + " is " + calculator.multiply(a, b);
                    break;

                case "divide":
                    c = "The result of dividing " + a + " and " + b + " is " + calculator.divide(a, b);
                    break;

                case "find remainder":
                    c = "The remainder of dividing " + a + " and " + b + " is " + calculator.remainder(a, b);
                    break;

                default:
                    c = "Invalid operation. Choose from the following: add, multiply, subtract, divide, find remainder ";

            }

            JOptionPane.showMessageDialog(null, c);




        }

    }
}
