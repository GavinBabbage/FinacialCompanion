package TimeValueOfMoney;

import Main.Driver;

public class TimeToReachFutureValue {
    public static double TTRFV() {
        double presentValue;
        double futureValue;
        double interestRate;
        double years;

        System.out.println("■ Time to Reach Future Value ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: n = ln(FV / PV) / ln(1 + i)]");
        System.out.println(" - Calculates the number of years required to reach a future value given an initial investment and interest rate.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Present Value (PV): R");
        presentValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Future Value (FV): R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (i) (as a decimal): ");
        interestRate = Double.parseDouble(Driver.keyboard.nextLine());

        years = Math.log(futureValue / presentValue) / Math.log(1 + interestRate);

        System.out.println();
        System.out.printf(" · Time Required to Reach Future Value: %.4f years", years);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return years;
    }
}
