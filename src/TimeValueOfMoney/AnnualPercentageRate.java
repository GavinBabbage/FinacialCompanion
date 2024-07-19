package TimeValueOfMoney;

import Main.Driver;

public class AnnualPercentageRate {
    public static double AnnualPercentageRate() {
        double effectiveAnnualRate;
        int compoundingPeriods;
        double annualPercentageRate;

        System.out.println("■ Annual Percentage Rate (APR) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: APR = m * ((1 + EAR)^(1/m) - 1)]");
        System.out.println(" - Calculates the annual percentage rate given the effective annual rate and compounding periods.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Effective Annual Rate (EAR) (as a decimal): ");
        effectiveAnnualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        annualPercentageRate = compoundingPeriods * (Math.pow(1 + effectiveAnnualRate, 1.0 / compoundingPeriods) - 1);
        System.out.println();
        System.out.printf(" · Annual Percentage Rate (APR): %.4f", annualPercentageRate);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return annualPercentageRate;
    }
}
