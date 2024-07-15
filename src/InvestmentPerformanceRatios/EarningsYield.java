package InvestmentPerformanceRatios;

import Main.Driver;

public class EarningsYield {
//    public static void main(String[] args) {
//        EY();
//    }
    public static double EY() {
        double answer;
        double earnings_per_share;
        double market_price_per_share;

        System.out.println("\uF0A5 Earnings Yield (EY) (Inverse of PE) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Earnings per share (EPS) x 100 / Market price per share]");
        System.out.println(" - Yield investors are demanding on their investments.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings Per Share (EPS): R");
        earnings_per_share = Driver.keyboard.nextDouble();

        System.out.print("Market price per share: R");
        market_price_per_share = Driver.keyboard.nextDouble();

        answer = earnings_per_share * 100 / market_price_per_share;
        System.out.println();
        System.out.printf("\uF0A7 Earnings Yield (EY) (Inverse of PE): %.4f%%%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
