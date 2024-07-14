package ProfitabilityRatios;

import Main.Driver;

public class NetProfitOnSalesAfterTax {
//    public static void main(String[] args) {
//        OperatingProfitOnSalesAfterTax();
//    }

    public static double OperatingProfitOnSalesAfterTax(){
        double answer;
        double net_profit_after_tax;
        double revenue;

        System.out.println("\uF0A5 Net Profit on Sales after Tax \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit After Tax x 100 / Revenue]");
        System.out.println(" - The Net Profit on Sales after Tax ratio expresses the Net Profit AFTER Tax\n" +
                           "   as a percentage of the Total sales.");

        System.out.println();
        System.out.println(" \uF0A7 A decrease in Net Operating Profit after Tax can be caused by:\n" +
                "   \uF0D8 Decrease in Selling prices\n" +
                "   \uF0D8 Increase in Cost of sales\n" +
                "   \uF0D8 Increase in Operating expenses (Efficiencies)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit After Tax: R");
        net_profit_after_tax = Driver.keyboard.nextDouble();

        System.out.print("Revenue (Sales): R");
        revenue = Driver.keyboard.nextDouble();

        answer = (net_profit_after_tax * 100) / revenue;
        System.out.println();
        System.out.printf("\uF0A7 Net Profit After Tax: %.4f%%%n",answer);
        System.out.printf("\uF0A7 For every R1 of Revenue (Sales) earned %.4f%% was Net Profit AFTER Tax.",answer);
        System.out.println();
        System.out.printf("\uF0A7 For every R1 earned in Revenue (Sales) the firm earned R%.4f in Net profit\n" +
                          "  AFTER Interest and Tax (Net Profit attributable to shareholders).", answer/100);
        System.out.println();
        System.out.printf("\uF0A7 Net Profit After Tax (NPAT) : Revenue = %.4f : 1",answer/100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
