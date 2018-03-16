package com.company;

import javax.swing.*;

public class UserInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name");
        String age = JOptionPane.showInputDialog("Enter your age");
        JOptionPane.showMessageDialog(null, "Hello, " + name + ". You are " + age + " years old.");
    }
}
