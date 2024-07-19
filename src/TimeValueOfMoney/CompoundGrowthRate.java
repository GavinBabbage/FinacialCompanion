package TimeValueOfMoney;

import Main.Driver;

public class CompoundGrowthRate {
    public static double CAGR() {
        double beginningValue;
        double endingValue;
        int years;
        double cagr;

        System.out.println("■ Compound Annual Growth Rate (CAGR) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: CAGR = (Ending Value / Beginning Value)^(1 / n) - 1]");
        System.out.println(" - Calculates the compound growth rate over a specified period.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Beginning Value (PV) in cents: ");
        beginningValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Ending Value (FV) in cents: ");
        endingValue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Integer.parseInt(Driver.keyboard.nextLine());

        cagr = Math.pow(endingValue / beginningValue, 1.0 / years) - 1;

        System.out.println();
        System.out.printf(" · Compound Annual Growth Rate (CAGR): %.2f%%", cagr * 100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return cagr;
    }
}
