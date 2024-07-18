package BondCalculations;

import Main.Driver;

public class DurationAndConvexity {
    public static void DurationAndConvexity() {
        double faceValue;
        double couponRate;
        int periods;
        double marketRate;

        System.out.println("■ Macaulay Duration and Convexity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println(" - Calculates the duration and convexity of a bond.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Face Value (F): R");
        faceValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Coupon Rate (C) (as a decimal): ");
        couponRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Market Rate (r) (as a decimal): ");
        marketRate = Double.parseDouble(Driver.keyboard.nextLine());

        double bondPrice = calculateBondPrice(faceValue, couponRate, periods, marketRate);
        double duration = 0.0;
        double convexity = 0.0;

        for (int t = 1; t <= periods; t++) {
            double cashFlow = (couponRate * faceValue) / Math.pow(1 + marketRate, t);
            duration += t * cashFlow / bondPrice;
            convexity += t * (t + 1) * cashFlow / Math.pow(1 + marketRate, t);
        }
        duration += periods * faceValue / Math.pow(1 + marketRate, periods) / bondPrice;
        convexity += periods * (periods + 1) * faceValue / Math.pow(1 + marketRate, periods) / bondPrice;
        convexity /= Math.pow(1 + marketRate, 2);

        System.out.println();
        System.out.printf(" · Macaulay Duration: %.4f years", duration);
        System.out.println();
        System.out.printf(" · Convexity: %.4f", convexity);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
    }

    private static double calculateBondPrice(double faceValue, double couponRate, int periods, double marketRate) {
        double bondPrice = 0.0;
        for (int t = 1; t <= periods; t++) {
            bondPrice += (couponRate * faceValue) / Math.pow(1 + marketRate, t);
        }
        bondPrice += faceValue / Math.pow(1 + marketRate, periods);
        return bondPrice;
    }
}
