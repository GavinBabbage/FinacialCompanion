package AssetManagement;
import Main.*;
public class InventoryTurnoverRatio {
//    public static void main(String[] args) {
//        InventoryTurnover();
//    }

    public static double InventoryTurnover(){
        double answer;
        double cost_of_sales;
        double inventory;

        System.out.println("\u25A0 Inventory Turnover Ratio \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Cost of sales / Inventory]");
        System.out.println(" - Calculates the average number of times inventory is sold during the year.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Cost of sales: R");
        cost_of_sales = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Inventory: R");
        inventory = Double.parseDouble(Driver.keyboard.nextLine());

        answer = cost_of_sales / inventory;
        System.out.println();
        System.out.printf("\u00B7 Inventory Turnover Ratio: %.4f times.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
