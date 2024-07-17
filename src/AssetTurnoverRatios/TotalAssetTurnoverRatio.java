package AssetTurnoverRatios;
import Main.*;
public class TotalAssetTurnoverRatio {
//    public static void main(String[] args) {
//        TotalAssetTurnover();
//    }
    public static double TotalAssetTurnover(){
        double answer;
        double revenue;
        double total_assets_at_CV;

        System.out.println("\u25A0 Total Asset Turnover (TAT) \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Revenue (Sales) / Total Assets at COST VALUE]");
        System.out.println(" - Evaluates the use of ALL assets to generate Revenue (Income).");

        System.out.println();
        System.out.println(" \u00B7 A decrease in Total Asset Turnover may mean that assets have been utilised \n" +
                "   less effectively.");
        System.out.println(" \u00B7 Reasons:\n" +
                "     \u2023 Could be the result of asset purchases late in the previous year or \n" +
                "        revenue is down.\n" +
                "     \u2023 Increase in inventory levels or other current assets.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total Assets at COST VALUE (TA): R");
        total_assets_at_CV = Double.parseDouble(Driver.keyboard.nextLine());

        answer = revenue / total_assets_at_CV;
        System.out.println();
        System.out.printf("\u00B7 Total Asset Turnover (TAT): %.4f times.",answer);
        System.out.println();
        System.out.printf("\u00B7 Rev : TA = R%.4f : R1",answer);
        System.out.println();
        System.out.printf("\u00B7 In the target year, for every R1 invested in assets, R%.4f was generated as \n" +
                          "  sales income.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
