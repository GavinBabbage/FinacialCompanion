package FinancialLeverageRatios;
import Main.*;
public class DebtToEquityRatioAllLiabilities {
//    public static void main(String[] args) {
//        DebtToEquityAll();
//    }

    public static double DebtToEquityAll(){
        double answer;
        double non_current_liabilities;
        double current_liabilities;
        double total_equity;

        System.out.println("\u25A0 Debt To Equity Ratio \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Total Debt (Non-Current Liabilities + Current Liabilities) x 100 / Total Equity]");
        System.out.println(" - The Debt to equity ratio indicates that for every R1 of capital provided by\n" +
                           "   shareholders x cents was provided by ALL liabilities.");
        System.out.println(" - A higher Debt To Equity Ratio results in higher exposure to Financial Risk.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Non-Current Liabilities: R");
        non_current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Liabilities: R");
        current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total Equity: R");
        total_equity = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (non_current_liabilities + current_liabilities) * 100 / total_equity;
        System.out.println();
        System.out.printf("\u00B7 Debt To Equity Ratio: %.4f%%%n",answer);
        System.out.printf("\u00B7 For every R1 of finance provided by Equity in the target year, R%.4f was\n" +
                          "  provided by Debt.",answer/100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
