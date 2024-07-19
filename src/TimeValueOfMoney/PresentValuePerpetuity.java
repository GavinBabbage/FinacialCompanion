package TimeValueOfMoney;

import Main.Driver;

public class PresentValuePerpetuity {
    public static double PVP() {
        double paymentAmount;
        double discountRate;
        double presentValue;

        System.out.println("■ Present Value of Perpetuity ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = PMT / r]");
        System.out.println(" - Calculates the present value of a perpetuity.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Annual Payment Amount (PMT): R");
        paymentAmount = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Discount Rate (r) (as a decimal): ");
        discountRate = Double.parseDouble(Driver.keyboard.nextLine());

        presentValue = paymentAmount / discountRate;

        System.out.println();
        System.out.printf(" · Present Value of Perpetuity: R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
