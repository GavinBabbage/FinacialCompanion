package InvestmentPerformanceRatios;

import Main.Driver;

public class MarketPriceToBookUsingSharePrice {
//    public static void main(String[] args) {
//        MarketPriceToBook_SharePrice();
//    }
    public static double MarketPriceToBook_SharePrice() {
        double answer;
        double market_price_at_end_of_year;
        double nav_per_share;

        System.out.println("\uF0A5 Market Price to Book (Using Share price) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market Price at end of year / Book Value (NAV) per share]");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Price at end of year: R");
        market_price_at_end_of_year = Driver.keyboard.nextDouble();

        System.out.print("Book Value (NAV) per share: R");
        nav_per_share = Driver.keyboard.nextDouble();

        answer = market_price_at_end_of_year / nav_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Market Price to Book (Using Share price): %.4f times.%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}