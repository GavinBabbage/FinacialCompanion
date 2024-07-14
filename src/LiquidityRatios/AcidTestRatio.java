package LiquidityRatios;

import Main.Driver;

public class AcidTestRatio {
//    public static void main(String[] args) {
//        AcidTest();
//    }

    public static double AcidTest(){
        double answer;
        double current_assets;
        double current_liabilities;
        double inventory;

        System.out.println("\uF0A5 Acid test ratio (Quick ratio) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Current assets - Inventory) / Current liabilities]");
        System.out.println(" - A more RELIABLE indicator of liquidity.");
        System.out.println(" - Evaluates the ability of the firm to settle short debts /obligations without relying on\n" +
                "the sale of Inventory as it only relies on cash and debtors.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Current Assets (CA): R");
        current_assets = Driver.keyboard.nextDouble();

        System.out.print("Inventory: R");
        inventory = Driver.keyboard.nextDouble();

        System.out.print("Current Liabilities (CL): R");
        current_liabilities = Driver.keyboard.nextDouble();

        answer = (current_assets - inventory)/(current_liabilities);
        System.out.println();
        System.out.printf("\uF0A7 Acid test ratio (Quick ratio): %.4f times.",answer);
        System.out.println();
        System.out.printf("\uF0A7 CA : CL =  R%.4f : 1",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
