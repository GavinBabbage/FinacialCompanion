package TimeValueOfMoney;

import Main.Driver;

public class ContinuousCompounding {
    public static double Continuous() {
        double principal;
        double annualRate;
        double time;
        double futureValue;

        System.out.println("■ Continuous Compounding ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: FV = P × e^(i×n)]");
        System.out.println(" - Calculates the future value of an investment with continuous compounding.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Principal Amount (P): R");
        principal = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (i) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Time (n) in years: ");
        time = Double.parseDouble(Driver.keyboard.nextLine());

        futureValue = principal * Math.exp(annualRate * time);

        System.out.println();
        System.out.printf(" · Future Value (FV): R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
