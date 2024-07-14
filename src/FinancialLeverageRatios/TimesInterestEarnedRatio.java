package FinancialLeverageRatios;

import Main.Driver;

public class TimesInterestEarnedRatio {
//    public static void main(String[] args) {
//        TimesInterestEarned();
//    }

    public static double TimesInterestEarned(){
        double answer;
        double operating_profit_BEFORE_interest_tax;
        double interest_expense;

        System.out.println("\uF0A5 Times Interest Earned Ratio \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Operating Profit BEFORE Interest & Tax  / Interest Expense ]");
        System.out.println(" - Measures the ability of the business to pay Interest from ACCRUAL Net profits\n" +
                "   before interest and tax (EBIT) or");
        System.out.println(" - Amount of times Net Profit before Interest and tax covers Interest expense.");
        System.out.println(" - It is a measure of the degree of safety available to lenders.");
        System.out.println(" - An increase can confirms the decreasing level of leverage (Financial risk) confirmed by\n" +
                "   Debt and the Debt to Equity ratios.");
        System.out.println(" - Remember a firm’s Cash Flows pays interest not Accrual profits.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Operating profit BEFORE interest & tax: R");
        operating_profit_BEFORE_interest_tax = Driver.keyboard.nextDouble();

        System.out.print("Interest expense: R");
        interest_expense = Driver.keyboard.nextDouble();

        answer = operating_profit_BEFORE_interest_tax / interest_expense;
        System.out.println();
        System.out.printf("\uF0A7 Times Interest Earned Ratio: %.4f times.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
