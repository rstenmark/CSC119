/*
Program Name: Chapter4_Program11.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 2/25/2019
Description: Convert a user provided time duration in seconds to minutes, hours,
    or days based on the duration provided.
*/

import java.util.Scanner;


class Chapter4_Program11 {
    static final double secondsPerMinute = 60.0;
    static final double secondsPerHour = 3600.0;
    static final double secondsPerDay = 86400.0;

    public static void main(String[] args) {
        // Instantiate Scanner object
        Scanner scanIn = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a duration of time (in seconds): ");
        double seconds;
        seconds = (double)scanIn.nextInt();

        if(seconds >= secondsPerMinute & seconds < secondsPerHour) {
            System.out.printf("%.0f seconds is equal to %.2f minutes\n",
            seconds, seconds/secondsPerMinute);
        } else if(seconds >= secondsPerHour & seconds < secondsPerDay) {
            System.out.printf("%.0f seconds is equal to %.3f hours\n",
            seconds, seconds/secondsPerHour);
        } else if(seconds >= secondsPerDay) {
            System.out.printf("%.0f seconds is equal to %.3f days\n",
            seconds, seconds/secondsPerDay);
        } else {
            System.out.printf("%.0f seconds is equal to %.0f seconds\n",
            seconds, seconds);
        }

        // Close Scanner
        scanIn.close();
    }
}