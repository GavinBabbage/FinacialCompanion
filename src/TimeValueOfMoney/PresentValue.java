package TimeValueOfMoney;

import Main.Driver;

public class PresentValue {
    public static double PresentValue() {
        double futureValue;
        double annualRate;
        double years;
        int compoundingPeriods;
        double presentValue;

        System.out.println("■ Present Value (PV) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = FV / (1 + (i/m))^(n*m)]");
        System.out.println(" - Calculates the present value of a future sum of money considering compounding periods.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Future Value (FV): R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Rate of Return (i) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        presentValue = futureValue / Math.pow(1 + (annualRate / compoundingPeriods), years * compoundingPeriods);
        System.out.println();
        System.out.printf(" · Present Value (PV): R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
