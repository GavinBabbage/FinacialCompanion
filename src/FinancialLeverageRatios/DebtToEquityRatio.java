package FinancialLeverageRatios;

import Main.Driver;

public class DebtToEquityRatio {
    public static void main(String[] args) {
        DebtToEquity();
    }

    public static double DebtToEquity(){
        double answer;
        double non_current_liabilities;
        double current_liabilities;
        double total_equity;

        System.out.println("\uF0A5 Debt To Equity Ratio \uF0A5");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Total Debt (Non-Current Liabilities + Current Liabilities) x 100 / Total Equity]");
        System.out.println(" - The Debt to equity ratio indicates that for every R1 of capital provided by\n" +
                           "   shareholders x cents was provided by ALL liabilities.");
        System.out.println(" - A higher Debt To Equity Ratio results in higher exposure to Financial Risk.");

        System.out.println();

        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Non-Current Liabilities: R");
        non_current_liabilities = Driver.keyboard.nextDouble();

        System.out.print("Current Liabilities: R");
        current_liabilities = Driver.keyboard.nextDouble();

        System.out.print("Total Equity: R");
        total_equity = Driver.keyboard.nextDouble();

        answer = (non_current_liabilities + current_liabilities) * 100 / total_equity;
        System.out.println();
        System.out.printf("\uF0A7 Debt To Equity Ratio: %.4f%%%n",answer);
        System.out.println();
        System.out.printf("\uF0A7 For every R1 of finance provided by equity in the target year, \n" +
                          "   R%.4f was provided by debt.",answer/100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
