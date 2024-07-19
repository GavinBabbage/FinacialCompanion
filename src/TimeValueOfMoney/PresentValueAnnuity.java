package TimeValueOfMoney;

import Main.Driver;

public class PresentValueAnnuity {
    public static double PVA() {
        double periodicPayment;
        double annualRate;
        double years;
        int compoundingPeriods;
        double presentValueAnnuity;

        System.out.println("■ Present Value of Annuity (PVA) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PVA = P * (1 - (1 + (i/m))^(-n*m)) / (i/m)]");
        System.out.println(" - Calculates the present value of a series of equal periodic payments.");
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

        presentValueAnnuity = periodicPayment * (1 - Math.pow(1 + (annualRate / compoundingPeriods), -years * compoundingPeriods)) / (annualRate / compoundingPeriods);
        System.out.println();
        System.out.printf(" · Present Value of Annuity (PVA): R%.4f", presentValueAnnuity);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValueAnnuity;
    }
}
