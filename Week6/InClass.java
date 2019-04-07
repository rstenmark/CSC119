/*
Program Name:
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description:
*/


class InClass {

    static int fallingDistance(int time) {
        int fall;
        fall = (10 * time * time) / 2;
        return fall;

    }

    static void showFall(int time) {
        System.out.printf("Falling distance is: %d meters.\n", fallingDistance(time));
    }

    public static void main(String[] args) {
        int time;
        for(time=1; time <= 10; time++) {
            showFall(time);
        }
    }
}