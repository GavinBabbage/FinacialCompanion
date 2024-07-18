package InvestmentPerformanceRatios;
import Main.*;
public class EarningsYield {
//    public static void main(String[] args) {
//        EY();
//    }
    public static double EY() {
        double answer;
        double earnings_per_share;
        double market_price_per_share;

        System.out.println("■ Earnings Yield (EY) (Inverse of PE) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Earnings per share (EPS) x 100 / Market price per share]");
        System.out.println(" - Yield investors are demanding on their investments.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Earnings Per Share (EPS): R");
        earnings_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Market price per share: R");
        market_price_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        answer = earnings_per_share * 100 / market_price_per_share;
        System.out.println();
        System.out.printf(" · Earnings Yield (EY) (Inverse of PE): %.4f%%%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
