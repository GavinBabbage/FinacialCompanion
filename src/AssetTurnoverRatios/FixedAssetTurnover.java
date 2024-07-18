package AssetTurnoverRatios;
import Main.*;
public class FixedAssetTurnover {
//    public static void main(String[] args) {
//        NonCurrentTurnover();
//    }

    public static double NonCurrentTurnover(){
        double answer;
        double revenue;
        double fixed_assets_at_CV;

        System.out.println("■ Fixed Asset (Non-Current) Turnover ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Revenue (Sales) / Fixed (Non-Current) Assets at COST VALUE]");
        System.out.println(" - Evaluates the use of Fixed assets to generate income.");

        System.out.println();
        System.out.println("  · A decrease in Fixed Asset Turnover may mean that Non Current Assets have \n" +
                "   been utilised less effectively.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Fixed (Non-Current) Assets at COST VALUE: R");
        fixed_assets_at_CV = Double.parseDouble(Driver.keyboard.nextLine());

        answer = revenue / fixed_assets_at_CV;
        System.out.println();
        System.out.printf(" · Fixed (Non-Current) Asset Turnover (FAT): %.4f times.",answer);
        System.out.println();
        System.out.printf(" · Rev : FA = R%.4f : R1",answer);
        System.out.println();
        System.out.printf(" · In the target year, for every R1 invested in Fixed Assets, R%.4f was \n" +
                "  generated as Revenue (Sales Income).",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
