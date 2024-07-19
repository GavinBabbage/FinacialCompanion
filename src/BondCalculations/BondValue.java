package BondCalculations;

import Main.Driver;

public class BondValue {
    public static double calculateBondValue() {
        double faceValue;
        double couponRate;
        double marketRate;
        int periods;
        int paymentFrequency;
        double couponPayment;
        double adjustedMarketRate;
        double adjustedPeriods;
        double pvOfCoupons;
        double pvOfFaceValue;
        double bondValue;

        System.out.println("■ Bond Value ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Bond Value = PV of Coupons + PV of Face Value]");
        System.out.println(" - Calculates the present value of a bond based on coupon payments and face value.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Face Value (F): €");
        faceValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Coupon Rate (C) (as a decimal): ");
        couponRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Market Rate of Interest (r) (as a decimal): ");
        marketRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Payment Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Payment Frequency per Year (e.g., 1 for annual, 2 for semi-annual, 4 for quarterly): ");
        paymentFrequency = Integer.parseInt(Driver.keyboard.nextLine());

        // Adjust coupon payment, market rate, and periods for the payment frequency
        couponPayment = (faceValue * couponRate) / paymentFrequency;
        adjustedMarketRate = marketRate / paymentFrequency;
        adjustedPeriods = periods * paymentFrequency;

        // Present Value of Coupons
        pvOfCoupons = couponPayment * (1 - Math.pow(1 + adjustedMarketRate, -adjustedPeriods)) / adjustedMarketRate;

        // Present Value of Face Value
        pvOfFaceValue = faceValue / Math.pow(1 + adjustedMarketRate, adjustedPeriods);

        // Total Bond Value
        bondValue = pvOfCoupons + pvOfFaceValue;

        System.out.println();
        System.out.printf(" · Bond Value: €%.4f", bondValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return bondValue;
    }
}
