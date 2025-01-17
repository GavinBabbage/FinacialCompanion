package TimeValueOfMoney;

import Main.Driver;

public class FutureValue {
    public static double FutureValue() {
        double presentValue;
        double annualRate;
        double years;
        int compoundingPeriods;
        double futureValue;

        System.out.println("■ Future Value (FV) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = PV * (1 + (i/m))^(n*m)]");
        System.out.println(" - Calculates the future value of a present sum of money considering compounding periods.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Present Value (PV): R");
        presentValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Rate of Return (i) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        futureValue = presentValue * Math.pow(1 + (annualRate / compoundingPeriods), years * compoundingPeriods);
        System.out.println();
        System.out.printf(" · Future Value (FV): R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
