/*
Program Name: Chapter4_Program10.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/25/2019
Description: Determine if the user has optimal weight, is underweight, or is
    overweight based on their Body Mass Index. Get input from the user to
    determine their BMI.
*/

import java.util.Scanner;
import java.lang.Math;

class Chapter4_Program10 {
        // Deterrmine the user's BMI
        static double getBMI(double weight, double height) {
            return weight * 703 / Math.pow(height, 2.0);
        }

        // Determine the user's BMI category based on BMI.
        static void printBMICategory(double bmi) {
            if(bmi < 18.5) {
                System.out.println("You are underweight. (BMI < 18.5)");
            } else if (bmi > 25.0) {
                System.out.println("You are overweight. (BMI > 25)");
            } else {
                System.out.println("You are optimal weight. (BMI => 18.5 and BMI =< 25)");
            }
        }
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        double heightInches, weightPounds, bmi;

        System.out.print("What is your height (in inches)?: ");
        heightInches = scanIn.nextDouble();

        System.out.print("What is your weight (in pounds)?: ");
        weightPounds = scanIn.nextDouble();

        bmi = getBMI(weightPounds, weightInches);

        printBMICategory(bmi);

        // Close Scanner
        scanIn.close();
    }
}