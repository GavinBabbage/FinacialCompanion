package FinancialLeverageRatios;

import Main.Driver;

public class DebtToEquityRatioInterestBearingLiabilities {
//    public static void main(String[] args) {
//        DebtToEquityInterest();
//    }

    public static double DebtToEquityInterest(){
        double answer;
        double current_portion_long_term_loan;
        double long_term_loan;
        double total_equity;

        System.out.println("\uF0A5 Debt To Equity Ratio \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Interest Bearing Debt x 100 / Total Equity]");
        System.out.println(" - The Debt to Equity ratio indicates that for every R1 of capital provided by\n" +
                           "   shareholders x cents was provided by INTEREST BEARING LIABILITIES.");
        System.out.println(" - A higher Debt To Equity Ratio results in higher exposure to Financial Risk.");
        System.out.println(" - If there is a reduction in the target year it means the firm become less\n" +
                           "   reliant on IB debt to finance its assets - Less Financial Risk.");
        System.out.println(" - Interest rates on bank overdrafts can be risky as they are high and subject \n" +
                           "   to change.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Long Term Loan: R");
        long_term_loan = Driver.keyboard.nextDouble();

        System.out.print("Current Portion - Long Term Loan: R");
        current_portion_long_term_loan = Driver.keyboard.nextDouble();

        System.out.print("Total Equity (E): R");
        total_equity = Driver.keyboard.nextDouble();

        answer = (long_term_loan + current_portion_long_term_loan) * 100 / total_equity;
        System.out.println();
        System.out.printf("\uF0A7 Debt To Equity Ratio: %.4f%%%n",answer);
        System.out.printf("\uF0A7 Interest Bearing Debt : E  = %.4f : R1",answer);
        System.out.println();
        System.out.printf("\uF0A7 For every R1 of finance provided by Equity in the target year, R%.4f was\n" +
                "  provided by Interest Bearing Debt.",answer/100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
