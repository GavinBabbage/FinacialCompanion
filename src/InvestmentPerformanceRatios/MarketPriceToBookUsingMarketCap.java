package InvestmentPerformanceRatios;

import Main.Driver;

public class MarketPriceToBookUsingMarketCap {
//    public static void main(String[] args) {
//        MarketPriceToBook_MarketCap();
//    }

    public static double MarketPriceToBook_MarketCap() {
        double answer;
        double market_capitalisation;
        double total_equity;
        double nci;

        System.out.println("\uF0A5 Market Price to Book (using Market Capitalisation) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market Capitalisation / Total Equity (Net of NCI)]");
        System.out.println(" - It shows the value the firm has generated for each R1 invested by shareholders.");
        System.out.println(" - Compares the Market Price of the share to the Book Value of the share.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Capitalisation: R");
        market_capitalisation = Driver.keyboard.nextDouble();

        System.out.print("Total Equity: R");
        total_equity = Driver.keyboard.nextDouble();

        System.out.print("Non-Controlling Interests: R");
        nci = Driver.keyboard.nextDouble();

        answer = market_capitalisation / (total_equity - nci);
        System.out.println();
        System.out.printf("\uF0A7 Market Price to Book (using Market Capitalisation): %.4f times.%n", answer);
        System.out.printf("\uF0A7 In the target year, for each R1 invested, Oceana added R%.4f to \n" +
                          "  shareholder value.%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}