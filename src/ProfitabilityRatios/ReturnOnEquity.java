package ProfitabilityRatios;

import Main.Driver;

public class ReturnOnEquity {
//    public static void main(String[] args) {
//        ROE();
//    }
    public static double ROE(){
        double answer;
        double net_profit_after_tax;
        double shareholder_equity;

        System.out.println("\uF0A5 Return on Equity (ROE) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit AFTER Tax x 100 / Shareholders’ Equity]");
        System.out.println(" - The overall measure of the financial success of the firm with respect to\n" +
                           "   increasing shareholders wealth.");
        System.out.println(" - Return the shareholders earn on investment made at BEGINNING of the year.");
        System.out.println(" - Maybe consider using Equity at the beginning of the year (it’s finance\n" +
                           "   invested)");
        System.out.println(" - As Equity at the End includes Net Profit After Tax (NPAT) less Dividends\n" +
                           "   for current year!");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit AFTER tax: R");
        net_profit_after_tax = Driver.keyboard.nextDouble();

        System.out.print("Shareholders’ Equity: R");
        shareholder_equity = Driver.keyboard.nextDouble();

        answer = (net_profit_after_tax * 100) / shareholder_equity;
        System.out.println();
        System.out.printf("\uF0A7 Return on Equity (ROE): %.4f%%%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
