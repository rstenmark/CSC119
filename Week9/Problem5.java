/*
Program Name:
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description:
*/

import java.util.Scanner;

class Problem5 {
    static final int SIZE = 18;
    static final int[] numbers = {5658845, 4520125, 7895122, 8777541, 8451277,
        1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231,
        6545231, 3852085, 7576651, 7881200, 458100};

    public static void main(String[] args) {
        // Instantiate new Scanner
        Scanner scanIn = new Scanner(System.in);

        int inputNumber, found = 0;

        try {
            for(;;) {
                System.out.print("Enter number to validate: ");
                inputNumber = scanIn.nextInt();

                for(int index=0; index < SIZE; index++) {
                    if(inputNumber == numbers[index]) {
                        found = 1;
                        break;
                    }
                }

                if(found == 1) {
                    System.out.println("Number is valid.");
                } else {
                    System.out.println("Number is invalid.");
                }
            }

        } catch(Exception e) {

        }
    }
}
