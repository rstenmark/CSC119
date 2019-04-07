/*
Program Name: Midterm.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 3/18/19
Description: Determine total calories and percentage of calories from fat
    in a food item. Get number of grams of fat, protein, and carbohydrates
    from user input.
    Validate input:
        1. Validate yes/no dialogue with case insensitive comparison
        2. number of fat, protein, and carbohydrates not less than 0
*/

import java.util.Scanner;

class Midterm {

    /* Nutrition information validation method.
        Returns true on validation success
        Returns false on validation failure
    */
    static boolean validateNutritionInfo(int gramsFat, int gramsProtein, int gramsCarbohydrates) {
        // Food item cannot have negative grams of fat, protein, or carbohydrates
        if (gramsFat < 0
            | gramsProtein < 0
            | gramsCarbohydrates < 0) {
            System.out.println("\nA food item cannot contain less than 0"
                +"grams of fat, protein, or carbohydrates.");
            // Input is invalid, validation failed.
                return false;
        } else {
            // Input is valid, validation succeeded
            return true;
        }
    }

    /* Continue dialogue validation method.
        Returns false on yesno != "y" | "yes" (User does not want to continue)
        Returns true on yesno == "y" | "yes" (User wants to continue)
    */
    static boolean validateContinueDialogue(String yesno) {
        if(!(yesno.equalsIgnoreCase("y")
            | yesno.equalsIgnoreCase("yes"))) {
                // The user did not input "yes" or "y" (case-insensitive)
                return false;
            } else {
                // The user did input "yes" or "y"
                return true;
            }
    }

    /* Total calories calculation helper method */
    static int calculateTotalCalories(int gramsFat, int gramsProtein, int gramsCarbohydrates) {
        return (gramsFat * 9) + (gramsProtein * 4) + (gramsCarbohydrates * 4);
    }

    /* Percent calories from fat calculation helper method */
    static float calculateCaloriesFromFatPercent(int gramsFat, float totalCalories) {
        return (float)(gramsFat * 9) / (float)totalCalories;
    }

    /* Return true if less than 30% of calories in the food item come from fat (it is "low fat")
       Return false if more tha 30% of calories in the food item come from fat (it is not "low fat")
    */
    static boolean isLowFat(float caloriesFromFatPercent) {
        return caloriesFromFatPercent < 0.3;
    }

    public static void main(String[] args) {
        // Declare working variables
        int gramsFat, gramsProtein, gramsCarbohydrates, totalCalories;
        float caloriesFromFatPercent;
        String yesno = new String();

        // Instantiate new Scanner
        Scanner scanIn = new Scanner(System.in);

        // Print program information
        System.out.println("This program calculates percentage of calories from fat in a food.");
        System.out.println("It then determines if the food is low fat.");

        // Determine if user wants to continue
        System.out.print("Do you wish to continue (y/n)?\n-->");
        yesno = scanIn.nextLine();

        // Validate user input from continue dialogue
        while(validateContinueDialogue(yesno)) {
            // Get user input for nutrition information
            System.out.print("\nHow many grams of fat are in the food?: ");
            gramsFat = scanIn.nextInt();
            System.out.print("How many grams of protein are in the food?: ");
            gramsProtein = scanIn.nextInt();
            System.out.print("How many grams of carbohydrates are in the food?: ");
            gramsCarbohydrates = scanIn.nextInt();

            // If nutrition info validates successfully, calculate and print results
            // Otherwise skip to continue dialogue
            if(validateNutritionInfo(gramsFat, gramsProtein, gramsCarbohydrates)) {
                // Calculate total calories and percent calories from fat
                totalCalories = calculateTotalCalories(gramsFat, gramsProtein, gramsCarbohydrates);
                caloriesFromFatPercent = calculateCaloriesFromFatPercent(gramsFat, totalCalories);

                // Print results
                System.out.printf("\nIn this food:\n\tThere are %d total calories."
                    + "\n\t%.2f percent of the total calories come from fat.",
                    totalCalories, caloriesFromFatPercent*100);

                // Let the user know if this food is "low-fat"
                if(isLowFat(caloriesFromFatPercent)) {
                    System.out.print("\n\tThis food is considered 'low-fat'");
                }
            }

            // Determine if user wants to continue
            System.out.print("\n\nDo you wish to continue (y/n)?\n-->");
            yesno = scanIn.next();
        }

        // Print on program exit
        System.out.println("\nThank you, goodbye!");

        // Close Scanner
        scanIn.close();
    }
}
