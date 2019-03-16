/*
Program Name: Chapter7_Program4
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description: Determine the number of miles per hour over the speed limit
    a speeding driver was doing. 
    Validate the user's input:
        1. 70 >= Speed limit >= 20
        2. Driver's speed > Speed limit
*/

import java.util.Scanner;

class Chapter7_Program4 {
    static boolean validate(int driverSpeed, int speedLimit) {
        if((70 >= speedLimit & speedLimit >= 20)
            & driverSpeed > speedLimit) {
                return false;
            } else {
                System.out.print("\nOne or more of your inputs are out of bounds"
                    + "\nor the input speed is not greater than the speed limit."
                    + "\nTry again.\n\n");
                return true;
            }
    }

    static int calculateSpeedOverLimit(int driverSpeed, int speedLimit) {
        return driverSpeed - speedLimit;
    }
    public static void main(String[] args) {
        // Declare working variables
        int driverSpeed, speedLimit;
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        do {
            System.out.print("Enter the speed limit in MPH (at least 20, not greater than 70): ");
            speedLimit = scanIn.nextInt();
            System.out.print("Enter the driver's speed (must be greater than the speed limit): ");
            driverSpeed = scanIn.nextInt();
        } while (validate(driverSpeed, speedLimit));

        System.out.printf("\nThe driver was exceeding the %d MPH speed limit by %d MPH.\n",
            speedLimit, calculateSpeedOverLimit(driverSpeed, speedLimit));

        // Close Scanner object
        scanIn.close();
    }
}