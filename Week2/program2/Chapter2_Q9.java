/*
Program Name: Chapter2_Q9.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/8/19
Description: Given a starting weight, and assuming a weight loss of 4 lbs/month,
    this program projects and displays weight loss over a 6 month period.
*/

package program2;

// Import scanner class
import java.util.Scanner;

public class Chapter2_Q9 {

    public static void main(String[] args) {

        // Declare projected monthly weight loss as a constant integer
        final int weightLossPerMonth = 4;

        // Instantiate scanner object
        Scanner scanIn = new Scanner(System.in);


        /* INPUT */


        /* Prompt user to input their weight in pounds,
            then store that value as an integer */
        System.out.print("What is your weight (in Pounds)?: ");
        int initialWeight = scanIn.nextInt();


        /* PROCESSING */


        /* To calculate the user's weight for each month, I iteratively subtract
            4 pounds per month for 6 months,
            and store those values in an array. */

        // Declare an array of integers
        int[] projectedWeightLoss;

        // Allocate memory for 6 integers
        projectedWeightLoss = new int[6];

        // Declare an integer finalWeight and set its value equal to intialWeight;
        int finalWeight = initialWeight;

        /* Every month, subtract 4 pounds from finalWeight and store that value
            in an integer array projectedWeightLoss. */
        for(int month=0; month<6; month++) {
            finalWeight = finalWeight - weightLossPerMonth;
            projectedWeightLoss[month] = finalWeight;
        }


        /* OUTPUT */


        // Print table header
        System.out.println("\nYour projected weight loss:");

        // Print column headers
        System.out.println("Month\t:\tWeight");

        // Print table data for each month
        for(int month=0; month<6; month++) {
            System.out.printf("%d\t:\t%d lbs.\n", month+1, projectedWeightLoss[month]);
        }

        // Close scanner object
        scanIn.close();

    }
}
