package TimeValueOfMoney;

import Main.Driver;

public class FutureValueAnnuity {
    public static double FVA() {
        double periodicPayment;
        double annualRate;
        double years;
        int compoundingPeriods;
        double futureValueAnnuity;

        System.out.println("■ Future Value of Annuity (FVA) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FVA = P * ((1 + (i/m))^(n*m) - 1) / (i/m)]");
        System.out.println(" - Calculates the future value of a series of equal periodic payments.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Periodic Payment (P): R");
        periodicPayment = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Rate of Return (i) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        futureValueAnnuity = periodicPayment * (Math.pow(1 + (annualRate / compoundingPeriods), years * compoundingPeriods) - 1) / (annualRate / compoundingPeriods);
        System.out.println();
        System.out.printf(" · Future Value of Annuity (FVA): R%.4f", futureValueAnnuity);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValueAnnuity;
    }
}
