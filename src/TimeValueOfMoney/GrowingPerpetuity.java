package TimeValueOfMoney;

import Main.Driver;

public class GrowingPerpetuity {
    public static void GP() {
        double cashFlow;
        double discountRate;
        double growthRate;
        double presentValue;

        System.out.println("■ Present Value of Growing Perpetuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = C / (r - g)]");
        System.out.println(" - Calculates the present value of a growing perpetuity.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Cash Flow (C) in the first year: R");
        cashFlow = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Discount Rate (r) (as a decimal): ");
        discountRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Growth Rate (g) (as a decimal): ");
        growthRate = Double.parseDouble(Driver.keyboard.nextLine());

        if (discountRate <= growthRate) {
            System.out.println("Error: Discount rate must be greater than the growth rate.");
            return;
        }

        presentValue = cashFlow / (discountRate - growthRate);

        System.out.println();
        System.out.printf(" · Present Value of the Growing Perpetuity: R%.2f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
    }
}
