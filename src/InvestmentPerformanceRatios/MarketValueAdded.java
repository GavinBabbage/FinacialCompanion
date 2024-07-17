package InvestmentPerformanceRatios;
import Main.*;
public class MarketValueAdded {
//    public static void main(String[] args) {
//        MVA();
//    }

    public static double MVA() {
        double answer;
        double market_capitalisation;
        double total_equity;
        double nci;

        System.out.println("\u25A0 Market Value Added (MVA) \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market capitalisation – (Total equity – NCI)]");
        System.out.println(" - A negative MVA means Market value < Book value");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Capitalisation: R");
        market_capitalisation = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Total Equity: R");
        total_equity = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Non-Controlling Intrerests (NCI): R");
        nci = Double.parseDouble(Driver.keyboard.nextLine());

        answer = market_capitalisation - total_equity + nci;
        System.out.println();
        System.out.printf("\u00B7 Market Value Added (MVA): R%.4f%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}