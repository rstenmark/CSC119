/*
Program Name: Chapter7_Program1.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 03/17/19
Description: Determine user's gross pay based on input hourly pay rate and number
    of hours worked. Validate user input: accept pay rates only $18.25 >= rate >= $7.50
    and hours worked only 40 >= hours >= 0.
*/

import java.util.Scanner;

class Chapter7_Program1 {
    static boolean validate(double payRate, int hoursWorked) {
        // Returns false on successful validation, true on validation failure
        if((18.25 >= payRate & payRate >= 7.50)
            & (40 >= hoursWorked & hoursWorked >= 0)) {
                return false;
            } else {
                System.out.println("\nOne or more of your inputs are out of bounds. Try again.\n");
                return true;
            }
    }

    static double calculateGrossPay(double payRate, int hoursWorked) {
        return payRate * (double)hoursWorked;
    }
    public static void main(String[] args) {
        // Declare working variables
        double payRate;
        int hoursWorked;
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Input/validation loop
        do {
            System.out.print("Enter your hourly pay rate (between $7.50 and $18.25/hr): $");
            // Cast input to double to allow user to input integers without validation failure
            payRate = (double)scanIn.nextDouble();
            System.out.print("Enter your number of hours worked (between 0 and 40 hours): ");
            hoursWorked = scanIn.nextInt();
        } while(validate(payRate, hoursWorked));

        // Print output
        System.out.printf("Your weekly gross pay is: $%.2f.%n", calculateGrossPay(payRate, hoursWorked));

        // Close Scanner object
        scanIn.close();
    }
}