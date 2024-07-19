package BondCalculations;

import Main.Driver;

public class YieldToMaturity {
    public static double YieldToMaturity() {
        double faceValue;
        double bondPrice;
        double couponRate;
        int periods;
        int paymentFrequency;

        System.out.println("■ Yield to Maturity (YTM) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Iterative solution where YTM makes PV of all bond payments equal\n" +
                "          to current price]");
        System.out.println(" - Calculates the yield to maturity of a bond.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Face Value (F): R");
        faceValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Bond Price: R");
        bondPrice = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Coupon Rate (C) (as a decimal): ");
        couponRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years to Maturity: ");
        int years = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Payment Frequency per Year (e.g., 1 for annual, 2 for semi-annual): ");
        paymentFrequency = Integer.parseInt(Driver.keyboard.nextLine());

        periods = years * paymentFrequency;

        double ytm = findYTM(faceValue, bondPrice, couponRate, periods, paymentFrequency);
        System.out.println();
        System.out.printf(" · Yield to Maturity (YTM): %.4f%%", ytm * 100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return ytm;
    }

    private static double findYTM(double faceValue, double bondPrice, double couponRate, int periods, int paymentFrequency) {
        double ytm = 0.1; // Initial guess (10%)
        double delta = 0.0001; // Accuracy
        double npv;
        double derivative;

        do {
            npv = 0.0;
            derivative = 0.0;
            double couponPayment = (couponRate * faceValue) / paymentFrequency;
            double adjustedYtm = ytm / paymentFrequency;

            for (int t = 1; t <= periods; t++) {
                double cashFlow = couponPayment;
                npv += cashFlow / Math.pow(1 + adjustedYtm, t);
                derivative -= t * cashFlow / Math.pow(1 + adjustedYtm, t + 1);
            }
            npv += faceValue / Math.pow(1 + adjustedYtm, periods);
            derivative -= periods * faceValue / Math.pow(1 + adjustedYtm, periods + 1);

            ytm -= (npv - bondPrice) / derivative;

        } while (Math.abs(npv - bondPrice) > delta);

        return ytm * paymentFrequency; // Convert periodic rate to annual rate
    }
}
