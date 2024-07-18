package AssetManagement;
import Main.*;
public class DaysInventoryOnHand {
//    public static void main(String[] args) {
//        DaysInventory();
//    }

    public static double DaysInventory(){
        double answer;
        double cost_of_sales;
        double inventory;

        System.out.println("■ Days inventory on hand ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Inventory x 365) / Cost of sales]");
        System.out.println(" - Calculates the average number of days between the purchase (when Risks &\n" +
                "Rewards of ownership is transferred from purchaser to the seller) and sale of\n" +
                "Inventory on Credit.");
        System.out.println(" - An increased Days inventory on hand relative to previous years’ and indicates\n" +
                "INEFFICIENT INVENTORY MANAGEMENT.");
        System.out.println(" - Increases risk of inventory Obsolescence (out of fashion & old), Carrying costs and Opportunity costs,\n" +
                "impacting negatively on future profits and cash flows.");
        System.out.println(" - The high levels of inventory would negatively affect the ROA and TAT ratios.");
        System.out.println(" - Holding too much inventory decreases the risk of stock-outs resulting in increased sales (profits) and\n" +
                "reduces ordering costs.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Inventory: R");
        inventory = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Cost of sales: R");
        cost_of_sales = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (inventory * 365)/(cost_of_sales);
        System.out.println();
        System.out.printf(" · Days inventory on hand: %.4f days.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
