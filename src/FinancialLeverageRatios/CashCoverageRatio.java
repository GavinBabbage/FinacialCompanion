package FinancialLeverageRatios;
import Main.*;
public class CashCoverageRatio {
//    public static void main(String[] args) {
//        CashCoverage();
//    }
    public static double CashCoverage(){
        double answer;
        double profit_before_taxation_interest;
        double depreciation;
        double amortisation;
        double interest_expense;

        System.out.println("\u25A0 Cash Coverage Ratio \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Earnings before Interest, Tax, Depreciation and Amortization (EBITDA) / Interest Expense]");
        System.out.println(" - Ability of the business to pay interest from Operating Cash flows.");
        System.out.println(" - A more RELIABLE indicator of the firm’s ability to pay interest.");
        System.out.println(" - It is a measure of the degree of safety available to lenders.");
        System.out.println(" - An increase can confirms the decreasing level of leverage (Financial risk)\n" +
                "   confirmed by Debt and the Debt to Equity ratios.");
        System.out.println(" - Remember a firm’s Cash Flows pays interest not Accrual profits.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Profit before Taxation: R");
        profit_before_taxation_interest = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Depreciation: R");
        depreciation = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Amortization: R");
        amortisation = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Interest expense: R");
        interest_expense = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (profit_before_taxation_interest + interest_expense + depreciation + amortisation) / interest_expense;
        System.out.println();
        System.out.printf("\u00B7 Cash Coverage Ratio: %.4f times.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
