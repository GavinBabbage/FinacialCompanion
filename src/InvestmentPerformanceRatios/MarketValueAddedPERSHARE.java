package InvestmentPerformanceRatios;
import Main.*;
public class MarketValueAddedPERSHARE {
//    public static void main(String[] args) {
//        MVA_PERSHARE();
//    }
    public static double MVA_PERSHARE() {
        double answer;
        double market_value_added;
        double number_of_shares_issued;

        System.out.println("\u25A0 Market Value Added (MVA) PER SHARE \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market Value Added (MVA) / Number of shares issued]");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Value Added (MVA): R");
        market_value_added = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of shares issued: ");
        number_of_shares_issued = Double.parseDouble(Driver.keyboard.nextLine());

        answer = market_value_added / number_of_shares_issued;
        System.out.println();
        System.out.printf("\u00B7 Market Value Added (MVA) PER SHARE: R%.4f per share.", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
