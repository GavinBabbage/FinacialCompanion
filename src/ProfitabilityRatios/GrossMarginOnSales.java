package ProfitabilityRatios;

import Main.Driver;

public class GrossMarginOnSales {
//    public static void main(String[] args) {
//        GrossMargin();
//    }
    public static double GrossMargin(){
        double answer;
        double gross_margin;
        double revenue;

        System.out.println("\uF0A5 Gross Margin on Sales \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Gross margin x 100 / Revenue]");
        System.out.println(" - The Gross Margin on Sales ratio calculates the amount that is left from every\n" +
                           "   R1 of sales earned after deducting the Cost of Sales Expense.");
        System.out.println(" - Hence the amount available to pay Operating expenses and Profit.");

        System.out.println();
        System.out.println(" \uF0A7 A decrease in GP margin can be caused by:\n" +
                "   \uF0D8 Lower prices\n" +
                "   \uF0D8 Increase in Cost of sales or combination of the two\n" +
                "   \uF0D8 Incorrect mix of inventory\n" +
                "   \uF0D8 Policies of inventory valuation (FIFO / Moving Weighted Average)");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Gross Margin: R");
        gross_margin = Driver.keyboard.nextDouble();

        System.out.print("Revenue (Sales): R");
        revenue = Driver.keyboard.nextDouble();

        answer = (gross_margin * 100) / revenue;
        System.out.println();
        System.out.printf("\uF0A7 Gross Margin: %.4f%%%n",answer);
        System.out.printf("\uF0A7 For every one rand of turnover the firm earned %.4f%% of Gross Profit.%n", answer);
        System.out.printf("\uF0A7 %% of sales income that covered Cost of sales: %.4f%%%n", 100 - answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
