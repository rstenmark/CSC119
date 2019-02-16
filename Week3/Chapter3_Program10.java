/*
Program Name: Chapter3_Program10.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/15/19
Description: Determine the amount of county and state sales tax to be paid
    for a user given amount of income for a retail company.
*/

import java.util.Scanner;

public class Chapter3_Program10 {

    // Define tax rates as constant doubles
    static final double countySalesTax = 0.02;
    static final double stateSalesTax = 0.04;

    // Determine county sales tax
    static double getCountySalesTax(double amount) {
        return amount * countySalesTax;
    }

    // Determine state sales tax
    static double getStateSalesTax(double amount) {
        return amount * stateSalesTax;
    }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get sales amount from user
        System.out.printf("What was the total sales amount this month?: $");
        double amountBeforeTax = scanIn.nextDouble();

        // Determine tax amounts and assign to variables
        double countyTaxAmount = getCountySalesTax(amountBeforeTax);
        double stateTaxAmount = getStateSalesTax(amountBeforeTax);
        double finalTaxAmount = countyTaxAmount + stateTaxAmount;

        // Display output
        System.out.printf("%nThe county tax amount is: $%.2f", countyTaxAmount);
        System.out.printf("%nThe state tax amount is: $%.2f", stateTaxAmount);
        System.out.printf("%nThe total sales tax amount is: $%.2f%n", finalTaxAmount);

        // Close Scanner object
        scanIn.close();
    }
}