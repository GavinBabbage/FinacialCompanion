package BondCalculations;

import Main.Driver;

public class BondPrice {
    public static double BondPrice() {
        double faceValue;
        double couponRate;
        int periods;
        double marketRate;
        double bondPrice = 0.0;

        System.out.println("■ Bond Price ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Bond Price = ∑ (C / (1 + r)^t) + (F / (1 + r)^n)]");
        System.out.println(" - Calculates the price of a bond based on its face value, coupon payments,\n" +
                "   and market rate.");
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

        // Calculate the price of the bond
        for (int t = 1; t <= periods; t++) {
            bondPrice += (couponRate * faceValue) / Math.pow(1 + marketRate, t);
        }
        bondPrice += faceValue / Math.pow(1 + marketRate, periods);

        System.out.println();
        System.out.printf(" · Bond Price: R%.4f", bondPrice);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return bondPrice;
    }
}
