package TimeValueOfMoney;

import Main.Driver;

public class CompoundInterest {
    public static double Compound() {
        double principal;
        double annualRate;
        int compoundingPeriods;
        double time;
        double futureValue;

        System.out.println("■ Compound Interest ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = P × (1 + i/m)^(m×n)]");
        System.out.println(" - Calculates the future value of an investment with compound interest.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Principal Amount (P): R");
        principal = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (i) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Times Interest is Compounded per Year (m): ");
        compoundingPeriods = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Time (n) in years: ");
        time = Double.parseDouble(Driver.keyboard.nextLine());

        futureValue = principal * Math.pow(1 + annualRate / compoundingPeriods, compoundingPeriods * time);

        System.out.println();
        System.out.printf(" · Future Value (FV): R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
