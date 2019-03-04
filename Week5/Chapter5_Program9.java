/*
Program Name: Chapter5_Program9.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description: Calculate an amount of money a person would earn over a user-provided
    number of days if their salary was increased 200% per day, starting at $0.01 per day.
*/

import java.util.Scanner;

class Chapter5_Program9 {
    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);
        
        // Get integer number of days to work from user
        System.out.print("How many days will you work?: ");
        int maxDays = scanIn.nextInt();

        double salary = 0.01;
        double total = 0.0;

        // Print table header
        System.out.printf("%n\tDay\t|\tDollars");
        // Print table and calculate new salary and total
        for(int day = 1; day <= maxDays; day++) {
            System.out.printf("%n\t%d\t|\t$%.2f", day, salary);
            total = total + salary;
            salary = salary * 2;
        }

        // Print total
        System.out.printf("%nTotal: $%.2f%n", total);

        // Close Scanner object
        scanIn.close();
    }
}