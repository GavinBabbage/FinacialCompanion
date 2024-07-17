package FinancialLeverageRatios;
import Main.*;
public class EquityMultiplier {
//    public static void main(String[] args) {
//        EM();
//    }

    public static double EM(){
        double answer;
        double total_assets;
        double total_equity;

        System.out.println("\u25A0 Net margin (NM) \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Total Assets / Total Equity]");
        System.out.println(" - Use of debt to lever up returns to shareholders / Exposure to Financial\n" +
                           "   risk.");
        System.out.println(" - Measure the degree to which a company is using borrowed money (debt) to\n" +
                           "   finance its assets.");
        System.out.println(" - Indicates the proportion of a company’s assets that are financed by\n" +
                           "   shareholders' equity.");
        System.out.println(" - A higher equity multiplier indicates higher financial leverage, meaning\n" +
                           "   the company relies more on debt to finance its assets.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Total Assets: R");
        total_assets = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total Equity: R");
        total_equity = Double.parseDouble(Driver.keyboard.nextLine());

        answer = total_assets / total_equity;
        System.out.println();
        System.out.printf("\u00B7 Equity Multiplier (EM): %.4f times.%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
