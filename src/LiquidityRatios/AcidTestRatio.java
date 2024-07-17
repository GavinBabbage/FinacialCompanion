package LiquidityRatios;
import Main.*;
public class AcidTestRatio {
//    public static void main(String[] args) {
//        AcidTest();
//    }

    public static double AcidTest(){
        double answer;
        double current_assets;
        double current_liabilities;
        double inventory;

        System.out.println("\u25A0 Acid test ratio (Quick ratio) \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Current assets - Inventory) / Current liabilities]");
        System.out.println(" - A more RELIABLE indicator of liquidity.");
        System.out.println(" - Evaluates the ability of the firm to settle short debts /obligations without relying on\n" +
                "the sale of Inventory as it only relies on cash and debtors.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Current Assets (CA): R");
        current_assets = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Inventory: R");
        inventory = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Liabilities (CL): R");
        current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (current_assets - inventory)/(current_liabilities);
        System.out.println();
        System.out.printf("\u00B7 Acid test ratio (Quick ratio): %.4f times.",answer);
        System.out.println();
        System.out.printf("\u00B7 CA : CL =  R%.4f : 1",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
