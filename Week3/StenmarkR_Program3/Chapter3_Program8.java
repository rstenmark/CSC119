/*
Program Name: Chapter3_Program8.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/15/19
Description: Determine the amount of income generated from ticket sales at a
    sports stadium.
*/

import java.util.Scanner;

public class Chapter3_Program8 {

     static double sumTicketSales(int classA, int classB, int classC) {
        double sum = (double)classA * 15.0 + (double)classB * 12.0 +
            (double)classC * 9.0;

        return sum;
     }

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get number of class A, B, and C seats sold as input from user
        System.out.print("How many class A seats were sold?: ");
        int classA = scanIn.nextInt();
        System.out.print("\t\t\tClass B?: ");
        int classB = scanIn.nextInt();
        System.out.print("\t\t\tClass C?: ");
        int classC = scanIn.nextInt();

        System.out.printf("%n$%.2f was generated from ticket sales.%n",
            sumTicketSales(classA, classB, classC));

        // Close Scanner object
        scanIn.close();
    }
}