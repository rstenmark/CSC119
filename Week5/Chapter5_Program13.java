/*
Program Name: Chapter5_Program13.java
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date: 03/03/19
Description: Display a multiplication table for the numbers 1 through 12.
*/

class Chapter5_Program13 {
    public static void main(String[] args) {
        // Use a nested loop to increment one multiplier only when inner loop is done.
        for(int i=1; i<13; i++) {
            for(int j=1; j<13; j++) {
                // Print multipliers and product.
                System.out.printf("%d * %d = %d\n", i, j, i*j);
                
            }
        }
    }
}