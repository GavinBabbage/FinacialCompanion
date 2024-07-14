package AssetManagement;

import Main.Driver;

public class InventoryTurnoverRatio {
//    public static void main(String[] args) {
//        InventoryTurnover();
//    }

    public static double InventoryTurnover(){
        double answer;
        double cost_of_sales;
        double inventory;

        System.out.println("\uF0A5 Inventory Turnover Ratio \uF0A5");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Cost of sales / Inventory]");
        System.out.println(" - Calculates the average number of times inventory is sold during the year.");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Cost of sales: R");
        cost_of_sales = Driver.keyboard.nextDouble();

        System.out.print("Inventory: R");
        inventory = Driver.keyboard.nextDouble();

        answer = cost_of_sales / inventory;
        System.out.println();
        System.out.printf("\uF0A7 Inventory Turnover Ratio: %.4f times.",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
