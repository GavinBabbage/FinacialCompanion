package InvestmentPerformanceRatios;

import Main.Driver;

public class DividendCover {
    public static void main(String[] args) {
        DC();
    }
    public static double DC(){
        double answer;
        double headline_earnings;
        double dividend_per_share;

        System.out.println("\uF0A5 Dividend Cover \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: HEADLINE Earnings per share (EPS) / Dividend per share (DPS)]");
        System.out.println(" - Indicates number of times the Dividends can be paid out of Current\n" +
                           "   earnings.");
        System.out.println(" - A high dividend cover means a large percentage of earnings are retained\n" +
                           "   within the firm to finance Future Growth Plans.");

        System.out.println();
        System.out.println(" \uF0A7 Dividend cover less than 1:\n" +
                "   \uF0D8 Current years earnings NOT enough to pay current year dividends.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("HEADLINE Earnings per share (EPS): R");
        headline_earnings = Driver.keyboard.nextDouble();

        System.out.print("Dividend per share (DPS): R");
        dividend_per_share = Driver.keyboard.nextDouble();

        answer = headline_earnings / dividend_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Dividend Cover: %.4f times",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
