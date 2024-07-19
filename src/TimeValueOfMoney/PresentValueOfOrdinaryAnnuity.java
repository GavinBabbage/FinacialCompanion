package TimeValueOfMoney;

import Main.Driver;

public class PresentValueOfOrdinaryAnnuity {
    public static double PVOA() {
        double payment;
        double interestRate;
        int periods;
        double presentValue;

        System.out.println("■ Present Value of Ordinary Annuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = PMT × (1 - (1 + r)^-n) / r]");
        System.out.println(" - Calculates the present value of an annuity with regular payments.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Payment Amount per Period (PMT): R");
        payment = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Interest Rate per Period (r) (as a decimal): ");
        interestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        double discountFactor = 1 / Math.pow(1 + interestRate, periods);
        presentValue = payment * ((1 - discountFactor) / interestRate);

        System.out.println();
        System.out.printf(" · Present Value of the Annuity: R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
