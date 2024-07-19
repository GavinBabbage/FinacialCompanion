package TimeValueOfMoney;

import Main.Driver;

public class EffectiveAnnualRate {
    public static double EffectiveAnnualRate() {
        double annualPercentageRate;
        int compoundingPeriods;
        double effectiveAnnualRate;

        System.out.println("■ Effective Annual Rate (EAR) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: EAR = (1 + (APR / m))^m - 1]");
        System.out.println(" - Calculates the effective annual interest rate given the annual percentage rate and compounding periods.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Annual Percentage Rate (APR) (as a decimal): ");
        annualPercentageRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        effectiveAnnualRate = Math.pow(1 + annualPercentageRate / compoundingPeriods, compoundingPeriods) - 1;
        System.out.println();
        System.out.printf(" · Effective Annual Rate (EAR): %.4f", effectiveAnnualRate);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return effectiveAnnualRate;
    }
}
