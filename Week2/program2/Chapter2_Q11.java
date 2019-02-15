/*
Program Name: Chapter2_Q11.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/8/19
Description: Determine a number of remaining slices of pizza from a quantity of
    pizzas, the number of slices in each pizza, and the number of people eating
    pizza (each person gets 3 slices).
*/

package program2;

// Import Scanner class
import java.util.Scanner;

public class Chapter2_Q11 {

    public static void main(String[] args) {

        // Instantiate scanner object
        Scanner scanIn = new Scanner(System.in);

        /* Declare the number of slices to be allocated to each person
            as a constant integer. */
        final int slicesPerPerson = 3;


        /* INPUT */


        /* Prompt the user to input the number of pizzas, the number of slices
            per pizza, and the number of people eating pizza. Then, store these
            values as integers. */
        System.out.print("How many pizzas do you have?: ");
        int numPizzas = scanIn.nextInt();

        System.out.print("How many slices in each pizza?: ");
        int numSlicesPerPizza = scanIn.nextInt();

        System.out.print("How many people are eating pizza?: ");
        int numPeople = scanIn.nextInt();


        /* PROCESSING */


        // Determine the total number of slices in all pizzas.
        int totalNumSlices = numPizzas * numSlicesPerPizza;
        // Determine the total number of slices that will be eaten
        int eatenSlices = slicesPerPerson * numPeople;
        // Determine the number of slices remaining after people eat.
        int remainingSlices = totalNumSlices - eatenSlices;


        /* OUTPUT */


        // Display user's input and clearly display the number of slices remaining.
        System.out.printf("\n\nYou have %d slices.", totalNumSlices);
        System.out.printf("\nAfter %d people eat %d slices each (a total of %d slices),", numPeople,
            slicesPerPerson, eatenSlices);

        /* Depending on the user's input, there are 2 cases:
                1. The user will have 0 or more slices of pizza left over after
                    people eat 3 slices each.
                2. The user will not have enough pizza to feed everyone 3 slices.
        */
        if(remainingSlices >= 0) {
            System.out.printf("\n\t--> You will have %d slices remaining.\n",
                remainingSlices);
        } else {
            System.out.print("\n--> You will not have enough pizza to feed everyone 3 slices.");
            System.out.printf("\n\tYou need %d more slices.\n\t(%d slices remaining.)\n",
                remainingSlices*-1, remainingSlices);
        }

        // Close scanner object.
        scanIn.close();

    }

}