/*
Program Name: Chapter3_Program11.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/15/19
Description: Determine the amount of packages of hot dogs and hot dog buns
    required for a cookout with the minimum number of leftovers
*/

import java.util.Scanner;
import java.lang.Math;

public class Chapter3_Program11 {

    // Define the number of hot dogs ands buns per package as consts
    static final int hotDogsPerPackage = 10;
    static final int bunsPerPackage = 8;

    static double getHotDogPackagesRequired(int hotDogs) {
        // ceil takes double, so cast ints to double before dividing
        return Math.ceil((double)hotDogs / (double)hotDogsPerPackage);
    }

    static double getBunPackagesRequired(int hotDogs) {
        // ceil takes double, so cast ints to double before dividing
        return Math.ceil((double)hotDogs / (double)bunsPerPackage);
    }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);
        
        // Get number of attendees from user
        System.out.print("How many people are attending the cookout?: ");
        int numPeople = scanIn.nextInt();

        // Get number of hot dogs per attendee from user
        System.out.print("How many hot dogs will each person be given?: ");
        int numHotDogsPerPerson = scanIn.nextInt();

        // Determine the total number of hot dogs required
        int totalHotDogs = numPeople * numHotDogsPerPerson;

        // Display output
        System.out.printf("%nTo make %d hot dogs:", totalHotDogs);

        System.out.printf("%n\tYou will need at least %d packs of %d hot dogs.",
            (int)getHotDogPackagesRequired(totalHotDogs), hotDogsPerPackage);

        System.out.printf("%n\tYou will need at least %d packs of %d buns.",
            (int)getBunPackagesRequired(totalHotDogs), bunsPerPackage);

        System.out.printf("%n\tThere will be %d hot dogs left over.",
            (int)getHotDogPackagesRequired(totalHotDogs) * hotDogsPerPackage - totalHotDogs);

        System.out.printf("%n\tThere will be %d buns left over.%n",
            (int)getBunPackagesRequired(totalHotDogs) * bunsPerPackage - totalHotDogs);

        // Close Scanner object
        scanIn.close();
    }
}
