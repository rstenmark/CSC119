import java.util.Scanner;

public class Week2
{
    public static void main(String[] args)
    {
        final int MONTHLY_WEIGHT_LOSS = 4;
        Scanner scanIn = new Scanner(System.in);
        int weight;

        System.out.print("Enter your starting weight: ");
        weight = scanIn.nextInt();

        for(int month=1; month<6; month++) {
            weight = weight - MONTHLY_WEIGHT_LOSS;
            System.out.printf("%s%d%s%d%s", "Your weight at the end of month ", month,
                " is ", weight, "\n");
        }

        scanIn.close();
    }
}