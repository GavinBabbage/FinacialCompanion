package TimeValueOfMoney;

import Main.Driver;
import java.util.Scanner;

public class NetPresentValue {
    public static double NPV() {
        Scanner keyboard = new Scanner(System.in);
        double initialInvestment;
        double rate;
        int periods;
        double npv = 0.0;

        System.out.println("■ Net Present Value (NPV) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: NPV = ∑ (Ct / (1 + r)^t) - C0]");
        System.out.println(" - Calculates the net present value of a series of cash flows.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Initial Investment (C0): R");
        initialInvestment = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Rate of Return (r) (as a decimal): ");
        rate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        for (int t = 1; t <= periods; t++) {
            System.out.printf("Cash Flow at Period %d (Ct): R", t);
            double cashFlow = Double.parseDouble(keyboard.nextLine());
            npv += cashFlow / Math.pow(1 + rate, t);
        }

        npv -= initialInvestment;
        System.out.println();
        System.out.printf(" · Net Present Value (NPV): R%.4f", npv);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return npv;
    }
}
