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

    public static void checkEquality(double lineOneLength, double lineTwoLength) {
        if (lineOneLength == lineTwoLength) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are not Equal");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");

        double lineOneLength = lineValues();
        System.out.println("Length Of Line 1 is: " + lineOneLength);

        double lineTwoLength = lineValues();
        System.out.println("Length Of Line 2 is: " + lineTwoLength);

        checkEquality(lineOneLength, lineTwoLength);
    }
}