package TimeValueOfMoney;

import Main.Driver;

public class InternalRateOfReturn {
    public static double IRR() {
        double[] cashFlows;
        int periods;

        System.out.println("■ Internal Rate of Return (IRR) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: IRR is the rate (r) that makes NPV = 0]");
        System.out.println(" - Calculates the internal rate of return for a series of cash flows.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());
        cashFlows = new double[periods + 1];

        System.out.print("Initial Investment (negative value): R");
        cashFlows[0] = Double.parseDouble(Driver.keyboard.nextLine());

        for (int t = 1; t <= periods; t++) {
            System.out.printf("Cash Flow at Period %d (Ct): R", t);
            cashFlows[t] = Double.parseDouble(Driver.keyboard.nextLine());
        }

        double irr = findIRR(cashFlows);
        System.out.println();
        System.out.printf(" · Internal Rate of Return (IRR): %.4f%%", irr * 100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return irr;
    }

    private static double findIRR(double[] cashFlows) {
        double irr = 0.1; // Initial guess
        double delta = 0.0001; // Accuracy
        double npv;
        double derivative;

        do {
            npv = 0.0;
            derivative = 0.0;

            for (int t = 0; t < cashFlows.length; t++) {
                npv += cashFlows[t] / Math.pow(1 + irr, t);
                derivative += -t * cashFlows[t] / Math.pow(1 + irr, t + 1);
            }

            irr -= npv / derivative;

        } while (Math.abs(npv) > delta);

        return irr;
    }
}
