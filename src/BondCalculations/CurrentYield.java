package BondCalculations;

import Main.Driver;

public class CurrentYield {

    public static double CurrentYield() {
        double currentYield = 0.0;

        System.out.println("■ Current Yield ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Annual Coupon Payment / Current Market Price) * 100%]");
        System.out.println(" - Evaluates the yield an investor would receive if they bought the bond at\n" +
                           "   the current market price.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Annual Coupon Payment: ");
        double annualCoupon = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Market Price: ");
        double currentPrice = Double.parseDouble(Driver.keyboard.nextLine());

        currentYield = (annualCoupon / currentPrice) * 100.0;

        System.out.println();
        System.out.printf(" · Current Yield: %.4f%%", currentYield);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");

        return currentYield;
    }
}
