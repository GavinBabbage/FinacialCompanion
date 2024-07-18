package AssetManagement;
import Main.*;

public class AccountReceivablesDays {
//    public static void main(String[] args) {
//        CollectionPeriod();
//    }
    public static double CollectionPeriod(){
        double answer;
        double net_trade_receivables;
        double credit_sales;

        System.out.println("■ Account Receivables Days (Collection period) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (NET Trade Receivables x 365) / Credit Sales]");
        System.out.println(" - Calculates the Average number of days between the Credit sales and when the\n" +
                           "   Cash is collected from debtors. Assume here that all sales are on credit.");
        System.out.println();
        System.out.println("  · What are the benefits and risks when DECREASING collection period?\n" +
                "   ‣ Cash inflows improve, Bad debts decrease.\n" +
                "   ‣ Sales may decrease decreasing profits?");
        System.out.println("  · What are the benefits and risks when INCREASING collection period?\n" +
                "   ‣ Sales may increase increasing Accrual profits.\n" +
                "   ‣ Cash inflows reduce, Bad debts increase");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("NET Trade Receivables: R");
        net_trade_receivables = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Credit Sales: R");
        credit_sales = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (net_trade_receivables * 365) / credit_sales;
        System.out.println();
        System.out.printf(" · Account Receivables Days (Collection period): %.4f days.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
