package ProfitabilityRatios;
import Main.*;
public class NetOperatingProfitMargin {
//    public static void main(String[] args) {
//        OperatingProfitMargin();
//    }

    public static double OperatingProfitMargin(){
        double answer;
        double net_profit_before_interest_tax;
        double revenue;

        System.out.println("■ Operating Profit Margin ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit BEFORE Interest & Tax x 100 / Revenue]");
        System.out.println(" - The Net Operating Profit Margin ratio expresses the Net Profit Before\n" +
                           "   Interest and Tax as a percentage of the Total Sales.");
        System.out.println(" - Measures the % of Sales Income that is retained after Cost of Sales and\n" +
                           "   Operating expenses are subtracted.");

        System.out.println();
        System.out.println("  · A decrease in Net Operating Margin can be caused by:\n" +
                "   ‣ Decrease in Selling prices\n" +
                "   ‣ Increase in Cost of sales\n" +
                "   ‣ Increase in Operating expenses (Efficiencies)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit BEFORE Interest & Tax: R");
        net_profit_before_interest_tax = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        answer = net_profit_before_interest_tax * 100/ revenue;
        System.out.println();
        System.out.printf(" · Net Profit BEFORE Interest & Tax: %.4f%%%n",answer);
        System.out.printf(" · For every R1 earned %.4f%% was Net profit BEFORE Interest and Tax.", answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}