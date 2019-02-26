/*
Program Name:
Programmer: Stenmark, Ryan
Course: CSC119-141 Introduction to Programming Java Spring 2019
Submission Date:
Description:
*/

class InClass2 {
    static final double startingTuition = 6000.0;
    static final double increasePercent = 0.02;
    static final int maxYears = 5;

    public static void main(String[] args) {
        double tuition = startingTuition;
        int year;

        for(year=1; year <= maxYears; year++) {
            System.out.printf("Year %d\t:\t$%.2f\n", year, tuition);
            tuition += tuition * increasePercent;
        }
    }
}
