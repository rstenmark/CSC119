/*
Program Name: Chapter4_Program8.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description: Get the user to input a number of pennies, nickels, dimes, and quarters.
    If the total value of the coins is equal to 1 dollar, congratulate the user,
    otherwise, display whether the amount was greater than or less than 1 dollar.
*/

import java.util.Scanner;

class Chapter4_Program8 {
    static final double valuePenny = 0.01;
    static final double valueNickel = 0.05;
    static final double valueDime = 0.10;
    static final double valueQuarter = 0.25;


    static double getSumOfChange(int pennies, int nickels, int dimes, int quarters) {
        return pennies*valuePenny + nickels*valueNickel + dimes*valueDime + quarters*valueQuarter;
    }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        System.out.print("How many pennies?: ");
        int numPennies = scanIn.nextInt();
        System.out.print("How many nickels?: ");
        int numNickels = scanIn.nextInt();
        System.out.print("How many dimes?: ");
        int numDimes = scanIn.nextInt();
        System.out.print("How many quarters?: ");
        int numQuarters = scanIn.nextInt();

        if(numPennies < 0 | numNickels < 0 | numDimes < 0 | numQuarters < 0) {
            System.out.println("You cannot have less than 0 of something!");
            System.exit(1);
        }

        double sumOfChange = getSumOfChange(numPennies, numNickels, numDimes, numQuarters);

        if(sumOfChange > 1.00) {
            System.out.println("Try again. The sum of the input change amount is greater than $1.");
        } else if (sumOfChange < 1.00) {
            System.out.println("Try again. The sum of the input change amount is less than $1.");
        } else {
            System.out.println("Congratulations! The sum of the input change amount is equal to $1!");
        }

        // Close Scanner
        scanIn.close();
    }
}