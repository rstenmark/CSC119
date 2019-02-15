/*
Program Name: InClass.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description:
*/

import java.util.Scanner;

public class InClass {
    // Declare constant double replacement percent
    final static double REPLACE_PERCENT = 0.08;


    // Instantiate new Scanner
    static Scanner scanIn = new Scanner(System.in);


    public static void main(String args[]) {

        // Declare variables
        double replace, minInsure = 0;

        // Call methods
        replace = getReplace();
        minInsure = setInsure(replace, minInsure);
        showSale(replace, minInsure);

        // Close scanner object
        scanIn.close();
    }


    // Get the replacement cost and return it as newInputReplace
    static double getReplace() {
        System.out.print("Enter the replacement amount: $");
        double newInputReplace = scanIn.nextDouble();
        return newInputReplace;
    }

    // Set the minimum insurance payout amount
    static double setInsure(double replace, double minInsure) {
        return replace * REPLACE_PERCENT;
    }

    // Display transaction information based on arguments replace, minInsure
    static void showSale(double replace, double minInsure) {
        System.out.printf("Replacement Cost: $%.2f\n", replace);
        System.out.printf("Percent insured: %%%.1f\n", (REPLACE_PERCENT*100.0));
        System.out.printf("Minimum insurance: $%.2f\n", minInsure);
    }
}