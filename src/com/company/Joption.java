package com.company;

import javax.swing.*;

public class Joption {

    public static void main(String[] args) {
        String side;
        side = JOptionPane.showInputDialog("Enter length of side");
        double area = Double.parseDouble(side) * Double.parseDouble(side);
        JOptionPane.showMessageDialog(null, "The area is: " + area);
    }
}
