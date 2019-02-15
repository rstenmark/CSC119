/* Ryan Stenmark <ryanpstenmark@gmail.com>
    February 4th, 2019
*/

import java.util.Scanner;

public class Tax
{
    public static void main(String[] args){
        // Instantiate scanner object
        Scanner scanIn = new Scanner(System.in);
        // Declare working variables
        double purchaseAmount, stateTax, countyTax, totalTax, totalSale;
        // Declare constant variables
        final double STATE_TAX_RATE = 0.04;
        final double COUNTY_TAX_RATE = 0.02;

        // Get input from user
        System.out.print("Enter the amount of the purchase: ");
        purchaseAmount = scanIn.nextDouble();

        // Do calculations & assign results to variables
        stateTax = purchaseAmount * STATE_TAX_RATE;
        countyTax = purchaseAmount * COUNTY_TAX_RATE;
        totalTax = stateTax + countyTax;
        totalSale = purchaseAmount + totalTax;

        // Display output
        System.out.printf("\n%s%.2f\n", "Purchase Amount: $", purchaseAmount);
        System.out.printf("%s%.2f%%\n", "State Tax: ", stateTax);
        System.out.printf("%s%.2f%%\n", "County Tax: ", countyTax);
        System.out.printf("%s%.2f%%\n", "Total Tax: ", totalTax);
        System.out.printf("%s%.2f\n", "Sale total: ", totalSale);

        // Close scanner
        scanIn.close();
    }
}