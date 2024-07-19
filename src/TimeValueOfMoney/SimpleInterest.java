package TimeValueOfMoney;

import Main.Driver;

public class SimpleInterest {
    public static double Simple() {
        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.println("■ Simple Interest ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Simple Interest = P × r × t]");
        System.out.println(" - Calculates the interest earned on an investment or loan over a period.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Principal Amount (P): R");
        principal = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Interest Rate (r) (as a decimal): ");
        rate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Time (t) in years: ");
        time = Double.parseDouble(Driver.keyboard.nextLine());

        simpleInterest = principal * rate * time;

        System.out.println();
        System.out.printf(" · Simple Interest: R%.4f", simpleInterest);
        System.out.println();
        System.out.printf(" · Total Balance: R%.4f", (principal + simpleInterest));
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return simpleInterest;
    }
}
