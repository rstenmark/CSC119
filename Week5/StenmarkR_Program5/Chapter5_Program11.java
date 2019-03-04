/*
Program Name: Chapter5_Program11.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 03/03/19
Description: Given a list of names, return the name that is first alphabetically
 and the name that is last alphabetically.
*/

import java.util.Scanner;

class Chapter5_Program11 {
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Allocate strings
        String newName, firstName, lastName;

        // Analogous to assigning smallest = Integer.MAX_VALUE in Program 10.
        firstName = "z";
        // Analogous to assigning largest = Integer.MIN     _VALUE in Program 10.
        lastName = "a";

        while(true) {
            System.out.println("Enter a name (or q to quit):");
            newName = scanIn.next().toLowerCase();
            // If the string input isn't equal to "q"
            if(!(newName.equals("q"))) {
                // Evaluate whether it is the first or last alphabetical name input
                if(newName.charAt(0) < firstName.charAt(0)) firstName = newName;
                if(newName.charAt(0) > lastName.charAt(0)) lastName = newName;
            // Otherwise break from loop
            } else {
                break;
            }
        }

        // Print first and last alphabetical name
        System.out.printf("Alphabetically first name: %s%nAlphabetically last name: %s\n",
         firstName, lastName);
        // Close Scanner object
        scanIn.close();
    }
}