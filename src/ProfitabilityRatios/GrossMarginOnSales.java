package ProfitabilityRatios;
import Main.*;
public class GrossMarginOnSales {
//    public static void main(String[] args) {
//        GrossMargin();
//    }
    public static double GrossMargin(){
        double answer;
        double gross_margin;
        double revenue;

        System.out.println("■ Gross Margin on Sales ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Gross margin x 100 / Revenue]");
        System.out.println(" - The Gross Margin on Sales ratio calculates the amount that is left from every\n" +
                           "   R1 of sales earned after deducting the Cost of Sales Expense.");
        System.out.println(" - Hence the amount available to pay Operating expenses and Profit.");

        System.out.println();
        System.out.println("  · A decrease in GP margin can be caused by:\n" +
                "   ‣ Lower prices\n" +
                "   ‣ Increase in Cost of sales or combination of the two\n" +
                "   ‣ Incorrect mix of inventory\n" +
                "   ‣ Policies of inventory valuation (FIFO / Moving Weighted Average)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Gross Margin: R");
        gross_margin = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Revenue (Sales): R");
        revenue = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (gross_margin * 100) / revenue;
        System.out.println();
        System.out.printf(" · Gross Margin: %.4f%%%n",answer);
        System.out.printf(" · For every one rand of turnover the firm earned %.4f%% of Gross Profit.%n", answer);
        System.out.printf(" · %% of sales income that covered Cost of sales: %.4f%%%n", 100 - answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
