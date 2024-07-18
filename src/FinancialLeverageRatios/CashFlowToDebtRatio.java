package FinancialLeverageRatios;
import Main.*;
public class CashFlowToDebtRatio {
//    public static void main(String[] args) {
//        CashFlowToDebt();
//    }
    public static double CashFlowToDebt(){
        double answer;
        double cash_flow_from_operations;
        double total_debt;
        double non_current_liabilities;
        double current_liabilities;


        System.out.println("■ Cash Flow To Debt Ratio ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Cash Flow From Operations / Total Debt]");
        System.out.println(" - Provides insight into the cash flows from OPERATIONS to repay Debt.");
        System.out.println(" - The ratio shows the % of total debt that is covered by the Net cash flow\n" +
                           "   from OPERATIONS (after deducting Interest, Tax and Dividends paid).");
        System.out.println(" - Provides information of a firm’s ability to generate sustainable cash flows\n" +
                           "   from NORMAL OPERATING ACTIVITIES.");
        System.out.println(" - Cash flows from OPERATING ACTIVITIES may be used for Debt repayments and\n" +
                           "   Investment expansion opportunities.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net cash inflow/(outflow) from operating activities: R");
        cash_flow_from_operations = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Non-Current Liabilities: R");
        non_current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Liabilities: R");
        current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (cash_flow_from_operations * 100) / (current_liabilities + non_current_liabilities);
        System.out.println();
        System.out.printf(" · Cash Coverage Ratio: %.4f%%%n",answer);
        System.out.println("\n------------------------------------------------------------------------------");
        return answer;
    }
}
