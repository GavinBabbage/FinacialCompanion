package InvestmentPerformanceRatios;
import Main.*;
public class DividendCover {
//    public static void main(String[] args) {
//        DC();
//    }
    public static double DC(){
        double answer;
        double headline_earnings;
        double dividend_per_share;

        System.out.println("■ Dividend Cover ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: HEADLINE Earnings per share (EPS) / Dividend per share (DPS)]");
        System.out.println(" - Indicates number of times the Dividends can be paid out of Current\n" +
                           "   earnings.");
        System.out.println(" - A high dividend cover means a large percentage of earnings are retained\n" +
                           "   within the firm to finance Future Growth Plans.");

        System.out.println();
        System.out.println("  · Dividend cover less than 1:\n" +
                "   ‣ Current years earnings NOT enough to pay current year dividends.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("HEADLINE Earnings per share (EPS): R");
        headline_earnings = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Dividend per share (DPS): R");
        dividend_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        answer = headline_earnings / dividend_per_share;
        System.out.println();
        System.out.printf(" · Dividend Cover: %.4f times",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
