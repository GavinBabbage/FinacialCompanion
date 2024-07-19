package TimeValueOfMoney;

import Main.Driver;

public class PresentValueForWithdrawal {
    public static double PVForWithdrawal() {
        double futureValue;
        double annualRate;
        double time;
        double presentValue;

        System.out.println("■ Present Value for Withdrawal ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PV = FV / e^(r×t)]");
        System.out.println(" - Calculates the present value required to achieve a future withdrawal.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Future Value (FV) to withdraw: R");
        futureValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (r) (as a decimal): ");
        annualRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Time (t) in years: ");
        time = Double.parseDouble(Driver.keyboard.nextLine());

        presentValue = futureValue / Math.exp(annualRate * time);

        System.out.println();
        System.out.printf(" · Present Value (PV) to deposit today: R%.4f", presentValue);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return presentValue;
    }
}
