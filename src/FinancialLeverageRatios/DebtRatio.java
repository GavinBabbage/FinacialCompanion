package FinancialLeverageRatios;

import Main.Driver;

public class DebtRatio {
//    public static void main(String[] args) {
//        Debt();
//    }

    public static double Debt(){
        double answer;
        double non_current_liabilities;
        double current_liabilities;
        double total_assets;

        System.out.println("\uF0A5 Debt Ratio \uF0A5");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Total Debt (Non-Current Liabilities + Current Liabilities) x 100 / Total Assets]");
        System.out.println(" - The Debt ratio indicates the percentage of Total assets financed by Total debt.");
        System.out.println(" - Think A = E + L.");

        System.out.println();
        System.out.println(" \uF0A7 Is a decrease in debt finance good or bad?\n" +
                "   \uF0D8 Good - Decreases exposure to Financial Risk Interest and capital\n" +
                "     repayments \n" +
                "   \uF0D8 Bad – forego advantage of debt to lever up returns to shareholder &\n" +
                "     benefits of interest tax shield to reduce tax expense");
        System.out.println();

        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Non-Current Liabilities: R");
        non_current_liabilities = Driver.keyboard.nextDouble();

        System.out.print("Current Liabilities: R");
        current_liabilities = Driver.keyboard.nextDouble();

        System.out.print("Total Assets: R");
        total_assets = Driver.keyboard.nextDouble();

        answer = (non_current_liabilities + current_liabilities) * 100 / total_assets;
        System.out.println();
        System.out.printf("\uF0A7 Debt Ratio: %.4f%%%n",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
