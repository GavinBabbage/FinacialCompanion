package AssetTurnoverRatios;

import Main.Driver;

public class TotalAssetTurnoverRatio {
//    public static void main(String[] args) {
//        TotalAssetTurnover();
//    }
    public static double TotalAssetTurnover(){
        double answer;
        double revenue;
        double total_assets_at_CV;

        System.out.println("\uF0A5 Total Asset Turnover (TAT) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Revenue (Sales) / Total Assets at COST VALUE]");
        System.out.println(" - Evaluates the use of ALL assets to generate Revenue (Income).");

        System.out.println();
        System.out.println(" \uF0A7 A decrease in Total Asset Turnover may mean that assets have been utilised \n" +
                "   less effectively.");
        System.out.println(" \uF0A7 Reasons:\n" +
                "     \uF0D8 Could be the result of asset purchases late in the previous year or \n" +
                "        revenue is down.\n" +
                "     \uF0D8 Increase in inventory levels or other current assets.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Revenue (Sales): R");
        revenue = Driver.keyboard.nextDouble();

        System.out.print("Total Assets at COST VALUE (TA): R");
        total_assets_at_CV = Driver.keyboard.nextDouble();

        answer = revenue / total_assets_at_CV;
        System.out.println();
        System.out.printf("\uF0A7 Total Asset Turnover (TAT): %.4f times.",answer);
        System.out.println();
        System.out.printf("\uF0A7 Rev : TA = R%.4f : R1",answer);
        System.out.println();
        System.out.printf("\uF0A7 In the target year, for every R1 invested in assets, R%.4f was generated as \n" +
                          "  sales income.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
