package TimeValueOfMoney;

import Main.Driver;

public class InterestRate {
    public static double IR() {
        double presentValue;
        double futureValue;
        int periods;
        double interestRate;

        System.out.println("■ Interest Rate ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: r = (FV / PV)^(1/n) - 1]");
        System.out.println(" - Calculates the annual interest rate based on initial investment and future value.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Present Value (PV): R");
        presentValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Future Value (FV): R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n) in years: ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        interestRate = Math.pow(futureValue / presentValue, 1.0 / periods) - 1;

        System.out.println();
        System.out.printf(" · Annual Interest Rate (r): %.4f%%", interestRate * 100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return interestRate;
    }
}
