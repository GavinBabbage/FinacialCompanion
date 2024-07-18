package FinancialLeverageRatios;
import Main.*;
public class DebtRatio {
//    public static void main(String[] args) {
//        Debt();
//    }

    public static double Debt(){
        double answer;
        double non_current_liabilities;
        double current_liabilities;
        double total_assets;

        System.out.println("\u25A0 Debt Ratio \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Total Debt (Non-Current Liabilities + Current Liabilities) x 100 / Total Assets]");
        System.out.println(" - The Debt Ratio indicates the percentage of Total assets financed by Total Debt.");
        System.out.println(" - Think A = E + L.");

        System.out.println();
        System.out.println(" \u00B7 Is a decrease in debt finance good or bad?\n" +
                "   \u2023 Good - Decreases exposure to Financial Risk Interest and capital\n" +
                "     repayments \n" +
                "   \u2023 Bad – forego advantage of debt to lever up returns to shareholder &\n" +
                "     benefits of interest tax shield to reduce tax expense");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Non-Current Liabilities: R");
        non_current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Liabilities: R");
        current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total Assets: R");
        total_assets = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (non_current_liabilities + current_liabilities) * 100 / total_assets;
        System.out.println();
        System.out.printf("\u00B7 Debt Ratio: %.4f%%%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
