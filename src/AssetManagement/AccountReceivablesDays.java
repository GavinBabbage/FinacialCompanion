package AssetManagement;

import Main.Driver;

public class AccountReceivablesDays {
//    public static void main(String[] args) {
//        CollectionPeriod();
//    }
    public static double CollectionPeriod(){
        double answer;
        double net_trade_receivables;
        double credit_sales;

        System.out.println("\uF0A5 Account Receivables Days (Collection period) \uF0A5");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (NET Trade Receivables x 365) / Credit Sales]");
        System.out.println(" - Calculates the Average number of days between the Credit sales and when the\n" +
                           "   Cash is collected from debtors. Assume here that all sales are on credit.");
        System.out.println();
        System.out.println(" \uF0A7 What are the benefits and risks when DECREASING collection period?\n" +
                "   \uF0D8 Cash inflows improve, Bad debts decrease.\n" +
                "   \uF0D8 Sales may decrease decreasing profits?");
        System.out.println(" \uF0A7 What are the benefits and risks when INCREASING collection period?\n" +
                "   \uF0D8 Sales may increase increasing Accrual profits.\n" +
                "   \uF0D8 Cash inflows reduce, Bad debts increase");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("NET Trade Receivables: R");
        net_trade_receivables = Driver.keyboard.nextDouble();

        System.out.print("Credit Sales: R");
        credit_sales = Driver.keyboard.nextDouble();

        answer = (net_trade_receivables * 365) / credit_sales;
        System.out.println();
        System.out.printf("\uF0A7 Account Receivables Days (Collection period): %.4f days.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
