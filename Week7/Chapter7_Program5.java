/*
Program Name: Chapter7_Program5.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 3/16/19
Description: A rock, paper, scissors game.
    Validate the user's input:
        1. User input is one of three case-insensitive strings:
            a. "rock"
            b. "paper"
            c. "scissors"
*/

import java.util.Scanner;
import java.util.Random;

class Chapter7_Program5 {
    // User input validation function
    static boolean validate(String input) {
        if(input.equalsIgnoreCase("rock")
            | input.equalsIgnoreCase("paper")
            | input.equalsIgnoreCase("scissors") 
        ) {
            return false;
        } else {
            System.out.print("\nYour input is invalid.\nTry again.\n");
            return true;
        }
    }

    // Determine the computer's choice ("rock" | "paper" | "scissors")
     static String cpuChoose() {
        Random rng = new Random();
        // Generate a random int in interval [0, 3);
        switch(rng.nextInt(3)) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
     }

     /* Game result matrix,
        returns 0 on draw, 1 on loss, 2 on win, 3 on error */
     static int winCondition(String user, String computer) {
         // User chose rock
         if(user.equalsIgnoreCase("rock")) {
             switch(computer) {
                 case "rock": return 0;
                 case "paper": return 1;
                 case "scissors": return 2;
                 default: return 3;
             }
         }
         // User chose paper
         else if(user.equalsIgnoreCase("paper")) {
            switch(computer) {
                case "rock": return 2;
                case "paper": return 0;
                case "scissors": return 1;
                default: return 3;
            }
        }
        // User chose scissors
        else if(user.equalsIgnoreCase("scissors")) {
            switch(computer) {
                case "rock": return 1;
                case "paper": return 2;
                case "scissors": return 0;
                default: return 3;
            }
        } else {
            /* This case should never happen since input is validated before
                win condition is evaluated. */
            return 3;
        }
     }
    public static void main(String[] args) {
        // Declare working variables
        String userChoice = new String();
        String cpuChoice = new String();
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Game loop, quit on user input "q".
        do {
            // Validation loop
            do {
                // Print prompt for input. Assume the user understands rock paper scissors.
                System.out.print("\nRock, paper, scissors! (enter q to quit)\n");
                System.out.print("--> ");

                // Get the user's choice
                userChoice = scanIn.nextLine();
                // Determine the computer's choice
                cpuChoice = cpuChoose();

                // Quit game when user inputs "q"
                if(userChoice.equalsIgnoreCase("q")) break;

                // Print cpu's choice and whether the user won or not
                switch(winCondition(userChoice, cpuChoice)) {
                    case 0:
                        System.out.println("\n" + userChoice + " vs. " + cpuChoice + "\n A draw.");
                        break;
                    case 1:
                        System.out.println("\n" + userChoice + " vs. " + cpuChoice + "\n You lose.");
                        break;
                    case 2:
                        System.out.println("\n" + userChoice + " vs. " + cpuChoice + "\n You win!");
                        break;
                    case 3:
                        System.out.println("\nThere was an error.");
                        break;
                }
            } while(validate(userChoice));
        } while (!userChoice.equalsIgnoreCase("q"));

        // Close Scanner object
        scanIn.close();
    }
}