package com.company;

public class HelloArray {

    public static void main(String[] args) {
        double ab[][] = {
                {2, 3, 5},
                {5, 6, 7}
        };

        double ba[][] = {
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i =0; i < ab.length; i++){
            for (int j = 0; j < ab[i].length; j++ ){
                double sum = ab[i][j] + ba[i][j];
                System.out.println(ab[i][j] + " + " + ba[i][j] + " = " + sum);
            }
        }

    }


}
