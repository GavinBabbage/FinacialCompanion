package TimeValueOfMoney;

import Main.Driver;

public class PresentValue {
    public static double PresentValue() {
        double futureValue;
        double rate;
        int periods;
        double presentValue;

        System.out.println("■ Present Value (PV) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = FV / (1 + r)^n]");
        System.out.println(" - Calculates the present value of a future sum of money.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Future Value (FV): R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Rate of Return (r) (as a decimal): ");
        rate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        presentValue = futureValue / Math.pow(1 + rate, periods);
        System.out.println();
        System.out.printf(" · Present Value (PV): R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
