package ProfitabilityRatios;

import Main.Driver;

public class NetOperatingProfitMargin {
//    public static void main(String[] args) {
//        OperatingProfitMargin();
//    }

    public static double OperatingProfitMargin(){
        double answer;
        double net_profit_before_interest_tax;
        double revenue;

        System.out.println("\uF0A5 Operating Profit Margin \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit Before Interest & Tax x 100 / Revenue]");
        System.out.println(" - The Net Operating Profit Margin ratio expresses the Net Profit Before\n" +
                           "   Interest and Tax as a percentage of the Total Sales.");
        System.out.println(" - Measures the % of Sales Income that is retained after Cost of Sales and\n" +
                           "   Operating expenses are subtracted.");

        System.out.println();
        System.out.println(" \uF0A7 A decrease in Net Operating Margin can be caused by:\n" +
                "   \uF0D8 Decrease in Selling prices\n" +
                "   \uF0D8 Increase in Cost of sales\n" +
                "   \uF0D8 Increase in Operating expenses (Efficiencies)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit Before Interest & Tax: R");
        net_profit_before_interest_tax = Driver.keyboard.nextDouble();

        System.out.print("Revenue (Sales): R");
        revenue = Driver.keyboard.nextDouble();

        answer = net_profit_before_interest_tax * 100/ revenue;
        System.out.println();
        System.out.printf("\uF0A7 Net Profit Before Interest & Tax: %.4f%%%n",answer);
        System.out.printf("\uF0A7 For every R1 earned %.4f%% was Net profit BEFORE Interest and Tax.", answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
