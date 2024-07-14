package ProfitabilityRatios;

import Main.Driver;

public class ReturnOnTotalAssets {
//    public static void main(String[] args) {
//        ROA();
//    }
    public static double ROA(){
        double answer;
        double earnings_after_interest_and_tax;
        double total_assets;

        System.out.println("\uF0A5 Return on Total Assets (ROA) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Earnings AFTER Interest and Tax x 100 / Total assets]");
        System.out.println(" - ROA evaluates the use of ALL assets to generate income AFTER Interest and Tax.");
        System.out.println(" - Understates the return as the AFTER tax cost of debt has NOT been removed.");
        System.out.println(" - Later after tax cost of debt will increase Net profit after interest and tax");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings AFTER Interest and Tax: R");
        earnings_after_interest_and_tax = Driver.keyboard.nextDouble();

        System.out.print("Total assets: R");
        total_assets = Driver.keyboard.nextDouble();

        answer = (earnings_after_interest_and_tax * 100) / total_assets;
        System.out.println();
        System.out.printf("\uF0A7 Return on Total Assets (ROA): %.4f%%%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
