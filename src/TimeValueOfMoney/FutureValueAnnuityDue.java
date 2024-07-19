package TimeValueOfMoney;

import Main.Driver;

public class FutureValueAnnuityDue {
    public static double FVAD() {
        double paymentAmount;
        double annualInterestRate;
        int periods;
        int compoundingPeriodsPerYear;
        double futureValue;
        double periodInterestRate;
        int totalPeriods;

        System.out.println("■ Future Value of Annuity Due ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = PMT * [(1 + (r/m))^(n*m) - 1] / (r/m)] * (1 + (r/m))");
        System.out.println(" - Calculates the future value of an annuity due with payments made at the beginning of each period.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Payment Amount (PMT): R");
        paymentAmount = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (r) (as a decimal): ");
        annualInterestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriodsPerYear = Integer.parseInt(Driver.keyboard.nextLine());

        // Calculate the interest rate per period
        periodInterestRate = annualInterestRate / compoundingPeriodsPerYear;

        // Total number of compounding periods
        totalPeriods = periods * compoundingPeriodsPerYear;

        // Calculate future value of ordinary annuity
        double futureValueOrdinaryAnnuity = paymentAmount * (Math.pow(1 + periodInterestRate, totalPeriods) - 1) / periodInterestRate;

        // Adjust for annuity due
        futureValue = futureValueOrdinaryAnnuity * (1 + periodInterestRate);

        System.out.println();
        System.out.printf(" · Future Value of Annuity Due: R%.2f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}

