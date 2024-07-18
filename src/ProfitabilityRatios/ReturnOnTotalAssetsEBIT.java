package ProfitabilityRatios;
import Main.*;
public class ReturnOnTotalAssetsEBIT {
//    public static void main(String[] args) {
//        ROA_EBIT();
//    }
    public static double ROA_EBIT(){
        double answer;
        double earnings_before_interest_and_tax;
        double total_assets_at_CV;

        System.out.println("■ Return on Total Assets (ROA) (EBIT) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Earnings BEFORE Interest and Tax x 100 / Total assets at COST VALUE]");
        System.out.println(" - ROA (EBIT) evaluates the use of ALL assets to generate income BEFORE Interest and Tax.");
        System.out.println(" - Useful to evaluate companies’ use of their assets with different levels of Tax and\n" +
                           "   Financial leverage (debt).");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings BEFORE Interest and Tax: R");
        earnings_before_interest_and_tax = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total assets at COST VALUE: R");
        total_assets_at_CV = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (earnings_before_interest_and_tax * 100) / total_assets_at_CV;
        System.out.println();
        System.out.printf(" · Return on Total Assets (ROA) (EBIT): %.4f%%%n",answer);
        System.out.printf(" · For every R1 invested in Total Assets the firm earned R%.4f in Net Profit\n" +
                "  BEFORE Interest and Tax (Net Profit attributable to shareholders).", answer/100);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
