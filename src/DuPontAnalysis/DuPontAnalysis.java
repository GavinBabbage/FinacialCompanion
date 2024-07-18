package DuPontAnalysis;
import FinancialLeverageRatios.EquityMultiplier;
import ProfitabilityRatios.NetMargin;
import AssetTurnoverRatios.TotalAssetTurnoverRatio;
import Main.*;
public class DuPontAnalysis {
//    public static void main(String[] args) {
//        DuPont();
//    }
    public static double[] DuPont(){
        double [] answer = new double[3];
        double dupont;
        System.out.println("■ Du Pont Analysis ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Margin x Total Asset Turnover x Equity Multiplier]");

        System.out.println("  · Net margin (NM):\n" +
                "   ‣ Evaluates operational efficiency in terms of Sales, COSE, Operating\n" +
                "      expenses.\n");

        System.out.println("  · Total asset turnover (TAT):\n" +
                "   ‣ Efficient use of assets.\n");

        System.out.println("  · Equity Multiplier (EM):\n" +
                "   ‣ Use of debt to lever up returns to shareholders / Exposure to  Financial\n" +
                "      risk.\n");

        System.out.print("------------------------------------------------------------------------------\n");
        answer[0] = NetMargin.NM();
        answer[1] = TotalAssetTurnoverRatio.TotalAssetTurnover();
        answer[2] = EquityMultiplier.EM();
        dupont = answer[0] * answer[1] * answer[2];
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.printf(" · Net Margin (NM): %.4f%%%n",answer[0]);
        System.out.printf(" · Total Asset Turnover (TAT): %.4f%%%n",answer[1]);
        System.out.printf(" · Equity Multiplier (EM): %.4f%%%n",answer[2]);
        System.out.printf(" · Return on Equity (ROE): %.4f%% x %.4f%% x %.4f%% = %.4f%%%n", answer[0], answer[1], answer[2], dupont);

        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
