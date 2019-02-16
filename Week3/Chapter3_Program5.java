/*
Program Name: Chapter3_Program5.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/15/19
Description: Determine the assessment value and property tax amount for a given
    actual value of a piece of property.
*/

import java.util.Scanner;

public class Chapter3_Program5 {

    static double getAssessmentValue(double propertyValue) {
        // The assessment value of a property is 60 percent of its actual value.
        return propertyValue * 0.6;
    }

    static double getPropertyTax(double assessmentValue) {
        // Property is taxed 64 cents for each $100 of assessment value.
        return 0.64 * (assessmentValue / 100);
    }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get the actual property value as input from the user.
        System.out.print("What is the actual value of the property?: $");
        double propertyValue = scanIn.nextDouble();

        // Output the resultant assessment value & property tax
        System.out.printf("%nThe assessment value of the property is: $%.2f",
            getAssessmentValue(propertyValue));
        System.out.printf("%nThe property tax for this property is: $%.2f%n",
            getPropertyTax(getAssessmentValue(propertyValue)));

        // Close Scanner object
        scanIn.close();
    }
}
