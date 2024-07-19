package TimeValueOfMoney;

import Main.Driver;

public class FutureValueGrowingPerpetuity {
    public static double FVGP() {
        double initialPayment;
        double discountRate;
        double growthRate;
        double presentValue;
        double futureValue;
        int periods;

        System.out.println("■ Future Value of Growing Perpetuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = C / (r - g); FV = PV * (1 + r)^n]");
        System.out.println(" - Calculates the future value of a perpetuity that grows at a constant rate.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Initial Payment (C): R");
        initialPayment = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Discount Rate (r) (as a decimal): ");
        discountRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Growth Rate (g) (as a decimal): ");
        growthRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        periods = Integer.parseInt(Driver.keyboard.nextLine());

        if (discountRate <= growthRate) {
            System.out.println("Discount rate must be greater than the growth rate.");
            return 0;
        }

        presentValue = initialPayment / (discountRate - growthRate);
        futureValue = presentValue * Math.pow(1 + discountRate, periods);

        System.out.println();
        System.out.printf(" · Future Value of Growing Perpetuity: R%.4f", futureValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return futureValue;
    }
}
