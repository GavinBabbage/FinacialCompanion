package TimeValueOfMoney;

import Main.Driver;

public class PresentValueAnnuityDue {
    public static double PVAD() {
        double paymentAmount;
        double annualInterestRate;
        int numberOfPeriods;
        int compoundingPeriodsPerYear;
        double presentValue;

        System.out.println("■ Present Value of Annuity Due ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = PMT × ((1 - (1 + r/m)^-mn) / (r/m)) × (1 + r/m)]");
        System.out.println(" - Calculates the present value of an annuity due with different compounding periods.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Payment Amount (PMT): R");
        paymentAmount = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (r) (as a decimal): ");
        annualInterestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        numberOfPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriodsPerYear = Integer.parseInt(Driver.keyboard.nextLine());

        double ratePerPeriod = annualInterestRate / compoundingPeriodsPerYear;
        int totalPeriods = numberOfPeriods * compoundingPeriodsPerYear;

        // Calculate present value of annuity due
        double annuityFactor = (1 - Math.pow(1 + ratePerPeriod, -totalPeriods)) / ratePerPeriod;
        presentValue = paymentAmount * annuityFactor * (1 + ratePerPeriod);

        System.out.println();
        System.out.printf(" · Present Value of Annuity Due: R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
