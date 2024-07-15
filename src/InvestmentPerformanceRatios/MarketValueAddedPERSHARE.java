package InvestmentPerformanceRatios;

import Main.Driver;

public class MarketValueAddedPERSHARE {
//    public static void main(String[] args) {
//        MVA_PERSHARE();
//    }
    public static double MVA_PERSHARE() {
        double answer;
        double market_value_added;
        double number_of_shares_issued;

        System.out.println("\uF0A5 Market Value Added (MVA) PER SHARE \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market Value Added (MVA) / Number of shares issued]");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Value Added (MVA): R");
        market_value_added = Driver.keyboard.nextDouble();

        System.out.print("Number of shares issued: ");
        number_of_shares_issued = Driver.keyboard.nextDouble();

        answer = market_value_added / number_of_shares_issued;
        System.out.println();
        System.out.printf("\uF0A7 Market Value Added (MVA) PER SHARE: R%.4f per share.", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
