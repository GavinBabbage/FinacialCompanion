package InvestmentPerformanceRatios;

import Main.Driver;

public class RetentionRatio {
//    public static void main(String[] args) {
//        Retention();
//    }
    public static double Retention() {
        double answer;
        double earnings_per_share;
        double dividends_per_share;

        System.out.println("\uF0A5 Retention Ratio (Ploughback/plowback ratio) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Earnings Per Share (EPS) – Dividends Per Share (DPS)) x 100 / Earnings Per Share (EPS)]");
        System.out.println(" - Evaluates what amount of profits are retained in the business to finance\n" +
                "   future growth plans.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings Per Share (EPS): R");
        earnings_per_share = Driver.keyboard.nextDouble();

        System.out.print("Dividends Per Share (DPS): R");
        dividends_per_share = Driver.keyboard.nextDouble();

        answer = (earnings_per_share - dividends_per_share) * 100 / earnings_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Retention ratio (Ploughback/plowback ratio): %.4f%%%n", answer);
        System.out.printf("\uF0A7 Pay-out Ratio = %.4f%%%n",100 - answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
