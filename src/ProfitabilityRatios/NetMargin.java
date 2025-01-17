package ProfitabilityRatios;
import Main.*;
public class NetMargin {
//    public static void main(String[] args) {
//        NM();
//    }

    public static double NM(){
        double answer;
        double net_profit_after_interest_tax;
        double revenue;

        System.out.println("■ Net Margin (NM) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net Profit AFTER Interest & Tax x 100 / Revenue]");
        System.out.println(" - Evaluates operational efficiency in terms of Sales, Cost of Sales,\n" +
                           "   Operating expenses.");
        System.out.println(" - Measures the amount of net profit generated from total revenue.");
        System.out.println(" - It indicates how well a company controls its costs and manages its\n" +
                           "   operations to generate profit.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net Profit AFTER Interest & Tax: R");
        net_profit_after_interest_tax = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        answer = net_profit_after_interest_tax * 100/ revenue;
        System.out.println();
        System.out.printf(" · Net Margin (NM): %.4f%%%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
