/*
Program Name: Chapter4_Program9.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/25/2019
Description: Determine the shipping cost of a package based on its weight
*/

import java.util.Scanner;

class Chapter4_Program9 {

    // Determine shipping cost per pound based on the weight of the package
    static double getShippingCostPerPound(double pounds) {
        if(pounds <= 2.0) {
            return 1.10;
        } else if (pounds >= 2.0 & pounds < 6.0) {
            return 2.20;
        } else if (pounds >= 6.0 & pounds < 10.0) {
            return 3.70;
        } else {
            return 3.80;
        }
    }
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get input from user
        System.out.print("How much does the package cost (in lbs)?: ");
        double packageWeightPounds = scanIn.nextDouble();

        double shippingCost = getShippingCostPerPound(packageWeightPounds) * packageWeightPounds;

        System.out.printf("The cost to ship this package is $%.2f.%n", shippingCost);

        // Close Scanner
        scanIn.close();
    }
}