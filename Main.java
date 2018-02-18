import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int mPGrating;
        double tankC;
        double gasPercentage;
        double rawRange;
        int range;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mPGrating = scnr.nextInt();

        if (mPGrating <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }
        else {
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            tankC = scnr.nextDouble();

            if (tankC <= 0.0) {
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }
            else {
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                gasPercentage = scnr.nextDouble();

                if (gasPercentage > 100.00001 || gasPercentage < 0.0) {
                    System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                }
                else {
                    rawRange = mPGrating * tankC * (gasPercentage * 0.01);
                    range = (int) rawRange;

                    if (rawRange <= 25) {
                        System.out.print("Attention! Your current estimated range is running low: " + range + " miles left!!!");
                    } else {
                        System.out.print("Keep driving! Your current estimated range is: " + range + " miles!");
                    }

                }


            }

        }

    }
}



