/*
Program Name:
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description:
*/

import java.util.Scanner;

class InClass1 {
    static int total;
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int num;

        System.out.print("Enter a positive number: ");
        num = scanIn.nextInt();

        while(num >= 0) {
            total += num;

            System.out.print("Enter a positive number (or a negative number to quit): ");
            num = scanIn.nextInt();
        }

        System.out.printf("The sum of the numbers is %d%n", total);

        scanIn.close();

    }
}