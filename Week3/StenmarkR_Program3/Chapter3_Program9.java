/*
Program Name: Chapter3_Program9.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description: Determine several important factors relating to the material
    and financial cost of a paint job.
*/

import java.util.Scanner;

public class Chapter3_Program9 {

    // Determine number of gallons of paint required based on wall area
    static double getGallonsRequired(double squareFeet) {
        return squareFeet / 115.0;
    }

    // Determine the labor hours required based on wall area
    static double getLaborHoursRequired(double squareFeet) {
        return (squareFeet / 115.0) * 8.0;
    }

    public static void main(String[] args) {

        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get wall area and paint cost per gallon from user
        System.out.print("How many square feet of wall space needs to be painted?: ");
        double wallSpaceSquareFeet = scanIn.nextDouble();
        System.out.print("How much does paint cost per gallon?: $");
        double paintCostPerGallon = scanIn.nextDouble();

        /* Determine gallons of paint and hours of labor required
            also determine cost of paint, labor, and total cost */
        double paintGallonsRequired = getGallonsRequired(wallSpaceSquareFeet);
        double hoursLaborRequired = getLaborHoursRequired(wallSpaceSquareFeet);
        double paintCost = paintCostPerGallon * paintGallonsRequired;
        double laborCost = 20.0 * hoursLaborRequired;
        double totalCost = paintCost + laborCost;

        // Display output
        System.out.printf("%nYou will need %.2f gallons of paint.", paintGallonsRequired);
        System.out.printf("%n%.2f hours of labor are required to finish the job.",
            hoursLaborRequired);
        System.out.printf("%n%.2f gallons of paint will cost $%.2f.", paintGallonsRequired,
            paintCost);
        System.out.printf("%n%.2f hours of labor will cost $%.2f.", hoursLaborRequired,
            laborCost);
        System.out.printf("%nThe total cost of the job is: $%.2f%n", totalCost);

        // Close Scanner object
        scanIn.close();
    }
}
