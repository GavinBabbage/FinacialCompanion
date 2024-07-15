package InvestmentPerformanceRatios;

import Main.Driver;

public class ReturnToShareholder {
//    public static void main(String[] args) {
//        HoldingPeriodReturn();
//    }
    public static double HoldingPeriodReturn() {
        double answer;
        double p0;
        double p1;
        double dividends_per_share;

        System.out.println("\uF0A5 Return to Shareholder (Holding Period Return (HPR)) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: ((P1 - P0) + DPS) x 100 / P0]");
        System.out.println(" - Overall return to shareholders including both Capital appreciation\n" +
                           "   (P1 – P0) and Cash return (Dividend) of the share.");
        System.out.println(" - Assumes that the share investment is purchased at the beginning of the\n" +
                           "   year & sold at the end of the year.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Current Share Price (P1): R");
        p1 = Driver.keyboard.nextDouble();

        System.out.print("Previous Share Price (P0): R");
        p0 = Driver.keyboard.nextDouble();

        System.out.print("Dividends Per Share (DPS): R");
        dividends_per_share = Driver.keyboard.nextDouble();

        answer = ((p1 - p0) + dividends_per_share) * 100 / p0;
        System.out.println();
        System.out.printf("\uF0A7 Return to Shareholder (Holding Period Return (HPR)): %.4f%%%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
