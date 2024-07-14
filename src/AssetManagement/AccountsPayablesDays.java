package AssetManagement;

import Main.Driver;

public class AccountsPayablesDays {
//    public static void main(String[] args) {
//        SettlementPeriod();
//    }

    public static double SettlementPeriod(){
        double answer;
        double trade_payables;
        double cost_of_sales;

        System.out.println("\uF0A5 Accounts Payables Days (Settlement period) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Accounts (Trade) Payables x 365) / Cost of Sales]");
        System.out.println(" - Calculates the Average number of days between the Credit purchases and when\n" +
                           "   the cash is paid to creditors.");
        System.out.println();
        System.out.println(" \uF0A7 How can we improve The Creditors Payment Period?\n" +
                "   \uF0D8 Increase payment period as long as it is within the credit terms. (Stretching");

        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Accounts (Trade) Payables: R");
        trade_payables = Driver.keyboard.nextDouble();

        System.out.print("Cost of Sales: R");
        cost_of_sales = Driver.keyboard.nextDouble();

        answer = (trade_payables * 365) / cost_of_sales;
        System.out.println();
        System.out.printf("\uF0A7 Accounts Payables Days (Settlement period): %.4f days.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
