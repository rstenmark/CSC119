/*
Program Name: Chapter5_Program10.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 03/03/19
Description: Determine the largest and smallest numbers from a user provided list of numbers.
*/

import java.util.Scanner;

class Chapter5_Program10 {
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        int largest, smallest;
        largest = Integer.MIN_VALUE;
        smallest = Integer.MAX_VALUE;
        int newInt;

        while(true) {
            // Get next integer from the user
            System.out.print("\nInput an integer number (or -99 to quit): ");
            newInt = scanIn.nextInt();

            // If the integer provided isn't equal to -99
            if(!(newInt == -99)) {
                // Evaluate whether it is the smallest or largest number input
                if(newInt < smallest) smallest = newInt;
                if(newInt > largest) largest = newInt;
            } else {
                // Otherwise break from loop
                break;
            }
        }

        // Print the largest and smallest numbers entered.
        System.out.printf("%nLargest number: %d, Smallest number: %d%n", largest, smallest);
        // Close Scanner object
        scanIn.close();
    }
}