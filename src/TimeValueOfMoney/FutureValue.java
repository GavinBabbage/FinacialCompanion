package TimeValueOfMoney;

import Main.Driver;

public class FutureValue {
    public static double FutureValue() {
        double presentValue;
        double rate;
        int periods;
        double futureValue;

        System.out.println("■ Future Value (FV) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = PV * (1 + r)^n]");
        System.out.println(" - Calculates the future value of a present sum of money.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Present Value (PV): R");
        presentValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Rate of Return (r) (as a decimal): ");
        rate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        futureValue = presentValue * Math.pow(1 + rate, periods);
        System.out.println();
        System.out.printf(" · Future Value (FV): R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
