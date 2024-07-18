package BondCalculations;

import Main.Driver;

public class YieldToMaturity {
    public static double YieldToMaturity() {
        double faceValue;
        double bondPrice;
        double couponRate;
        int periods;

        System.out.println("■ Yield to Maturity (YTM) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Iterative solution where YTM makes PV of all bond payments equal to current price]");
        System.out.println(" - Calculates the yield to maturity of a bond.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Face Value (F): R");
        faceValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Bond Price: R");
        bondPrice = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Coupon Rate (C) (as a decimal): ");
        couponRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        double ytm = findYTM(faceValue, bondPrice, couponRate, periods);
        System.out.println();
        System.out.printf(" · Yield to Maturity (YTM): %.4f%%", ytm * 100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return ytm;
    }

    private static double findYTM(double faceValue, double bondPrice, double couponRate, int periods) {
        double ytm = 0.1; // Initial guess
        double delta = 0.0001; // Accuracy
        double npv;

        do {
            npv = 0.0;

            for (int t = 1; t <= periods; t++) {
                npv += (couponRate * faceValue) / Math.pow(1 + ytm, t);
            }
            npv += faceValue / Math.pow(1 + ytm, periods);

            ytm -= (npv - bondPrice) / (periods * bondPrice);

        } while (Math.abs(npv - bondPrice) > delta);

        return ytm;
    }
}
