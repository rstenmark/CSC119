/*
Program Name: Chapter4_Program7.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/25/2019
Description: Determine the discount amount and purchase amount after discount
    based on a user provided number of software packages purchased.
*/

import java.util.Scanner;

class Chapter4_Program7 {

    static final Double packageCost = 99.0;

    static double getDiscountPercent(int Packages) {
        if(Packages >= 10 & Packages < 20) {
            return 0.20;
        } else if (Packages >= 20 & Packages < 50) {
            return 0.30;
        } else if (Packages >= 50 & Packages < 100) {
            return 0.40;
        } else if(Packages >= 100) {
            return 0.50;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        System.out.print("How many packages did you purchase?: ");
        int packagesPurchased = scanIn.nextInt();
        double discountPercent = getDiscountPercent(packagesPurchased);

        System.out.printf("For purchasing %d packages, you are eligible for a %.0f%% discount.%nYour final price is $%.2f.\n",
        packagesPurchased, discountPercent*100, (double)packagesPurchased*packageCost*discountPercent);

        // Close Scanner
        scanIn.close();
    }
}