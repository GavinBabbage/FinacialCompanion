package InvestmentPerformanceRatios;
import Main.*;
public class RetentionRatio {
//    public static void main(String[] args) {
//        Retention();
//    }
    public static double Retention() {
        double answer;
        double earnings_per_share;
        double dividends_per_share;

        System.out.println("■ Retention Ratio (Ploughback/plowback ratio) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Earnings Per Share (EPS) – Dividends Per Share (DPS)) x 100 / Earnings Per Share (EPS)]");
        System.out.println(" - Evaluates what amount of profits are retained in the business to finance\n" +
                "   future growth plans.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings Per Share (EPS): R");
        earnings_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Dividends Per Share (DPS): R");
        dividends_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (earnings_per_share - dividends_per_share) * 100 / earnings_per_share;
        System.out.println();
        System.out.printf(" · Retention ratio (Ploughback/plowback ratio): %.4f%%%n", answer);
        System.out.printf(" · Pay-out Ratio = %.4f%%%n",100 - answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
