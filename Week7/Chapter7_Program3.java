/*
Program Name: Chapter7_Program3.jav
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 3/17/19
Description: Determine calories from fat and whether the food is considered low fat
    from user provided calories and fat grams in a food. 
    Validate the user's input:
        1. number of fat grams and calories not less than 0
        2. number of calories cannot exceed fat grams * 9.
*/

import java.util.Scanner;

class Chapter7_Program3 {

    static boolean validate(int fatGrams, int calories) {
        if(fatGrams > 0
            & calories > 0
            & calories <= fatGrams * 9) {
                return false;
            } else {
                System.out.print("\nOne or more of your inputs are out of bounds," +
                    " or the number of calories input\nis greater than" +
                    " the number of fat grams input times 9.\nTry again.\n\n");
                return true;
            }
    }

    static double percentCaloriesFromFat(int fatGrams, int calories) {
        return ((double)fatGrams * 9.0) / (double)calories;
    }
    public static void main(String[] args) {
        // Declare working variables
        int fatGrams, calories;
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);
        // Input validation loop
        do {
            System.out.print("Enter the number of calories in the food item (more than 0 calories): ");
            calories = scanIn.nextInt();
            System.out.print("Enter the number of fat grams in the food item (more than 0 fat grams): ");
            fatGrams = scanIn.nextInt();
        } while(validate(fatGrams, calories));

        System.out.printf("%.2f percent of calories in this food item come from fat.\n",
            percentCaloriesFromFat(fatGrams, calories));
        
        if(percentCaloriesFromFat(fatGrams, calories) < 3.0) {
            System.out.print("This is a low fat food item.\n");
        }

        // Close Scanner object
        scanIn.close();
    }
}