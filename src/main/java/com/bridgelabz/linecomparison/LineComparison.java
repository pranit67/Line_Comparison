package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static double lineValues() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value For First Point");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Enter Value for Second Point");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double lineLength = (double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lineLength;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        double lineLength = lineValues();
        System.out.println("Length Of Line is: " + lineLength);

    }
}
