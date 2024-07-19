package TimeValueOfMoney;

import Main.Driver;

public class PresentValueDelayedAnnuity {
    public static double PVDA() {
        double futureValue;
        double interestRate;
        int yearsUntilStart;
        double presentValueToday;

        System.out.println("■ Present Value of Delayed Annuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = FV / (1 + r)^n]");
        System.out.println(" - Calculates the present value today of the amount needed for the education.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Future Value (FV): R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Interest Rate (r) (as a decimal): ");
        interestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Years Until Start: ");
        yearsUntilStart = Integer.parseInt(Driver.keyboard.nextLine());

        presentValueToday = futureValue / Math.pow(1 + interestRate, yearsUntilStart);

        System.out.println();
        System.out.printf(" · Present Value Today: R%.2f", presentValueToday);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValueToday;
    }
}

