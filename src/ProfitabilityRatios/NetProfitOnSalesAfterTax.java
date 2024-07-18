package ProfitabilityRatios;
import Main.*;
public class NetProfitOnSalesAfterTax {
//    public static void main(String[] args) {
//        OperatingProfitOnSalesAfterTax();
//    }

    public static double OperatingProfitOnSalesAfterTax(){
        double answer;
        double net_profit_after_tax;
        double revenue;

        System.out.println("■ Net Profit on Sales after Tax ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit After Tax x 100 / Revenue]");
        System.out.println(" - The Net Profit on Sales after Tax ratio expresses the Net Profit AFTER Tax\n" +
                           "   as a percentage of the Total sales.");

        System.out.println();
        System.out.println("  · A decrease in Net Operating Profit after Tax can be caused by:\n" +
                "   ‣ Decrease in Selling prices\n" +
                "   ‣ Increase in Cost of sales\n" +
                "   ‣ Increase in Operating expenses (Efficiencies)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit After Tax: R");
        net_profit_after_tax = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (net_profit_after_tax * 100) / revenue;
        System.out.println();
        System.out.printf(" · Net Profit After Tax: %.4f%%%n",answer);
        System.out.printf(" · For every R1 of Revenue (Sales) earned %.4f%% was Net Profit AFTER Tax.",answer);
        System.out.println();
        System.out.printf(" · For every R1 earned in Revenue (Sales) the firm earned R%.4f in Net profit\n" +
                          "  AFTER Interest and Tax (Net Profit attributable to shareholders).", answer/100);
        System.out.println();
        System.out.printf(" · Net Profit After Tax (NPAT) : Revenue = %.4f : 1",answer/100);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
