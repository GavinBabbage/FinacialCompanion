package InvestmentPerformanceRatios;

import Main.Driver;

public class PriceEarningsRatio {
//    public static void main(String[] args) {
//        PE_Ratio();
//    }

    public static double PE_Ratio() {
        double answer;
        double market_price_at_end_of_year;
        double headline_earnings_per_share;

        System.out.println("\uF0A5 Price Earnings Ratio (P/E) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market price at end of year / HEADLINE Earnings Per Share (HEPS)]");
        System.out.println(" - Measures how many times the Share price covers HEPS.");
        System.out.println(" - Amount that investors are willing to pay for each R1 of reported profits.");
        System.out.println(" - The market’s view (perception) of the Future Earnings potential of the,\n" +
                           "   company Future dividend policy & Degree of Risk involved in the\n" +
                           "   investment (Investors’confidence).");
        System.out.println(" - Dynamic ratio as it changes every 15 mins / daily with the market price\n" +
                           "   of the share.");
        System.out.println(" - High price earnings indicates: High future growth prospects and earnings.");
        System.out.println(" - Low price earnings indicates: Risky investment.");
        System.out.println(" - It is widely used by analysts when valuing a business.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market price at end of year: R");
        market_price_at_end_of_year = Driver.keyboard.nextDouble();

        System.out.print("HEADLINE Earnings Per Share: R");
        headline_earnings_per_share = Driver.keyboard.nextDouble();

        answer = market_price_at_end_of_year / headline_earnings_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Price Earnings Ratio (P/E): %.4f times.%n", answer);
        System.out.printf("\uF0A7 Investors are willing to pay %.4f times for each R1 of reported profits. ", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
