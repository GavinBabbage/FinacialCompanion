package InvestmentPerformanceRatios;

import Main.Driver;

public class DividendYield {
    public static void main(String[] args) {
        DY();
    }
    public static double DY(){
        double answer;
        double dividend_per_share;
        double market_price_per_share;

        System.out.println("\uF0A5 Dividend Yield (DY) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Dividend per Share (DPS) x 100 / Market price per share (MPS)]");
        System.out.println(" - Cash Return shareholders (Class A / Ordinary) earn on their investment in\n" +
                           "   the form of dividends.");
        System.out.println(" - Varies as the market price per share varies. Every 15 minutes, Daily.");
        System.out.println(" - Total yield would include dividends and capital appreciation.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Dividend per Share (DPS): R");
        dividend_per_share = Driver.keyboard.nextDouble();

        System.out.print("Market price per share (MPS): R");
        market_price_per_share = Driver.keyboard.nextDouble();

        answer = (dividend_per_share * 100) / market_price_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Dividend Yield (DY): %.4f%%%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }

}
