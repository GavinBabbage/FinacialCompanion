package InvestmentPerformanceRatios;

import Main.Driver;

public class MarketValueAdded {
//    public static void main(String[] args) {
//        MVA();
//    }

    public static double MVA() {
        double answer;
        double market_capitalisation;
        double total_equity;
        double nci;

        System.out.println("\uF0A5 Market Value Added (MVA) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Market capitalisation – (Total equity – NCI)]");
        System.out.println(" - A negative MVA means Market value < Book value");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Market Capitalisation: R");
        market_capitalisation = Driver.keyboard.nextDouble();

        System.out.print("Total Equity: R");
        total_equity = Driver.keyboard.nextDouble();

        System.out.print("Non-Controlling Intrerests (NCI): R");
        nci = Driver.keyboard.nextDouble();

        answer = market_capitalisation - total_equity + nci;
        System.out.println();
        System.out.printf("\uF0A7 Market Value Added (MVA): R%.4f%n", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}