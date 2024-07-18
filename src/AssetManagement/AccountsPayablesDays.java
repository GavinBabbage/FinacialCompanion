package AssetManagement;
import Main.*;

public class AccountsPayablesDays {
//    public static void main(String[] args) {
//        SettlementPeriod();
//    }

    public static double SettlementPeriod(){
        double answer;
        double trade_payables;
        double cost_of_sales;

        System.out.println("■ Accounts Payables Days (Settlement period) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Accounts (Trade) Payables x 365) / Cost of Sales]");
        System.out.println(" - Calculates the Average number of days between the Credit purchases and when\n" +
                           "   the cash is paid to creditors.");
        System.out.println();
        System.out.println("  · How can we improve The Creditors Payment Period?\n" +
                "   ‣ Increase payment period as long as it is within the credit terms. (Stretching");

        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Accounts (Trade) Payables: R");
        trade_payables = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Cost of Sales: R");
        cost_of_sales = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (trade_payables * 365) / cost_of_sales;
        System.out.println();
        System.out.printf(" · Accounts Payables Days (Settlement period): %.4f days.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
