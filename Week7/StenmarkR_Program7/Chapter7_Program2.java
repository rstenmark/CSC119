/*
Program Name: Chapter7_Program2.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 3/17/19
Description: Determine income from ticket sales at a theatre. The theatre has
    3 tiers of seating: tier A seats cost $20, tier B seats cost $15, and tier C
    seats cost $10. There are 300 tier A seats, 500 tier B seats, and 200 tier C seats.
    Validate the number of ticket sales input by the user.
*/

import java.util.Scanner;

class Chapter7_Program2 {
    static boolean validate(int tierASales, int tierBSales, int tierCSales) {
        if ((tierASales <= 300 & tierASales >= 0) 
            & (tierBSales <= 500 & tierBSales >= 0) 
            & (tierCSales <= 200 & tierCSales >= 0)) {
                return false;
            } else {
                System.out.print("\nOne or more of your inputs are out of bounds. Try again. \n");
                return true;
            }
    }

    static int calculateSalesProfit(int tierASales, int tierBSales, int tierCSales) {
        return 20 * tierASales + 15 * tierBSales + 10 * tierCSales;
    }
    public static void main(String[] args) {
        // Declare working variables
        int tierASales, tierBSales, tierCSales;
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);
        
        // Input validation loop
        do {
            System.out.print("Enter the number of tier A ticket sales (between 0 and 300): ");
            tierASales = scanIn.nextInt();
            System.out.print("Enter the number of tier B ticket sales (between 0 and 500): ");
            tierBSales = scanIn.nextInt();
            System.out.print("Enter the number of tier C ticket sales (between 0 and 200): ");
            tierCSales = scanIn.nextInt();
        } while (validate(tierASales, tierBSales, tierCSales));

        System.out.printf("The theatre grossed $%d in ticket sales.%n",
         calculateSalesProfit(tierASales, tierBSales, tierCSales));

        // Close Scanner object
        scanIn.close();
    }
}