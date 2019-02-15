/*
Program Name: Chapter2_Q8.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/8/19
Description: This program calculates and displays the total cost of a meal
    (including a 15 percent tip and 7 percent sales tax) from input provided by
    the user.
*/

package program2;

// Import Scanner class
import java.util.Scanner;


public class Chapter2_Q8 {

    public static void main(String[] args){

        // Declare tip and sales tax variables as constant doubles
        final double tipPercent = 0.15;
        final double salesTaxPercent = 0.07;

        // Instantiate a scanner object;
        Scanner scanIn = new Scanner(System.in);


        /* INPUT */


        // Get the initial cost from the user and store that value as a double
        System.out.print("How much does the meal cost?: $");
        double initialCost = scanIn.nextDouble();


        /* PROCESSING */


        // First calculate the cost of the meal after sales tax
        double costAfterSalesTax = initialCost + (initialCost * salesTaxPercent);

        // Then calculate the cost of the meal after tip
        double finalCost = costAfterSalesTax + (costAfterSalesTax * tipPercent);


        /* OUTPUT */


        // Print the cost after 7% sales tax:
        System.out.printf("\n%s%.2f", "Cost after 7% sales tax: $",
            costAfterSalesTax);

        // Print the cost after 15% tip:
        System.out.printf("\n%s%.2f", "Cost after additional 15% tip: $", finalCost);

        // Print final cost again for clarity
        System.out.printf("\n\t--> %s%.2f%s", "Final cost: $", finalCost, "\n");

        // Close scanner object
        scanIn.close();
    }

}