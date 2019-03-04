/*
Program Name: Chapter5_Program12.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 03/03/19
Description: Calculate the factorial of a user provided number.
*/

import java.util.Scanner;

class Chapter5_Program12 {
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        /* Using longs allows calculation of factorials less than !21, as long
            can store values up to 9,223,372,036,854,775,808, whereas int
            can only store values up to 2,147,483,647 */
        long input, result;
        result = 1;

        // Get input from user
        System.out.print("Enter a nonnegative integer number to determine its factorial: ");
        input = scanIn.nextLong();

        // Calculate factorial and store in result unless input is > 0.
        if(!(input < 1)) {
            for(long i=1; i<=input; i++) {
                // Multiplication is distributive:
                result = result * i;
            }
        } else {
            // Quit if input < 0.
            System.out.println("That number is negative. Try again.");
            scanIn.close();
            System.exit(0);
        }

        // Output result.
        System.out.printf("!%d = %d%n", input, result);

        // Close Scanner object
        scanIn.close();
    }
}