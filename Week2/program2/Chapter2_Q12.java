/*
Program Name: Chapter2_Q12.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/8/19
Description: Convert a given temperature in Celcius to Fahrenheit.
*/

package program2;

import java.util.Scanner;

public class Chapter2_Q12 {

    /* PROCESSING */

    /* Declare a function that takes a double, applies the celcius to fahrenheit
        unit change formula, and returns that value. */
    static double CelciusToFahrenheit(double celcius) {
        double fahrenheit = 1.8 * celcius + 32.0;
        return fahrenheit;
    }

    public static void main(String[] args) {

        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);


        /* INPUT */


        System.out.print("Enter a temperature in Celcius units: ");
        double celciusInput = scanIn.nextDouble();


        /* OUTPUT */


        /* Use function CelciusToFahrenheit to calculate Fahrenheit units from
            Celcius units and display this value. */
        System.out.printf("\n\t--> %.1f Celcius is equal to %.1f Fahrenheit.\n",
            celciusInput, CelciusToFahrenheit(celciusInput));

        // Close Scanner object
        scanIn.close();
    }
}