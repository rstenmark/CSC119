/*
Program Name: Chapter2_Q10.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/8/19
Description: Determine and display the total amount the user has paid on a
    car loan based on their monthly payment amount and the number of months they
    have been making payments.
*/

package program2;

// Import Scanner class
import java.util.Scanner;

public class Chapter2_Q10 {

    public static void main(String[] args) {

        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);


        /* INPUT */


        /* Prompt user to input their monthly payment amount and store this value
            as a double. */
        System.out.print("What is your monthly payment amount?: $");
        double monthlyPayment = scanIn.nextFloat();

        /* Prompt user to input the number of months they have been making payments
            and store this value as an integer. */
        System.out.print("For how many months have you been making payments?: ");
        int monthsPaid = scanIn.nextInt();


        /* PROCESSING */


        /* Determine the amount of money the user has paid by multiplying their
            monthly payment amount by the number of months they have made payments.

            I cast monthsPaid to a double to perform the multiplication operation. */
        double amountPaid = monthlyPayment * (double)monthsPaid;


        /* OUTPUT */


        // Display the total amount paid.
        System.out.printf("\nYou have paid $%.2f over %d months.\n", amountPaid,
            monthsPaid);

        // Close Scanner object
        scanIn.close();
    }
}