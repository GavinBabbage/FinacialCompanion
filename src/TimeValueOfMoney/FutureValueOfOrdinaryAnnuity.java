package TimeValueOfMoney;

import Main.Driver;

public class FutureValueOfOrdinaryAnnuity {
    public static double FVOA() {
        double paymentAmount;
        double interestRate;
        int years;
        double futureValue;

        System.out.println("■ Future Value of Ordinary Annuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = PMT × ((1 + r)^n - 1) / r]");
        System.out.println(" - Calculates the future value of an annuity.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Annual Payment Amount (PMT): R");
        paymentAmount = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (r) (as a decimal): ");
        interestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Integer.parseInt(Driver.keyboard.nextLine());

        futureValue = paymentAmount * ((Math.pow(1 + interestRate, years) - 1) / interestRate);

        System.out.println();
        System.out.printf(" · Future Value of Annuity: R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
