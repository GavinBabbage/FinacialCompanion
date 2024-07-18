package LiquidityRatios;
import Main.*;
public class CurrentRatio {
//    public static void main(String[] args) {
//        Current();
//    }

    public static double Current(){
        double answer;
        double current_assets;
        double current_liabilities;

        System.out.println("■ Current Ratio ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Current assets / Current liabilities]");
        System.out.println(" - Evaluates the ability of the firm to settle short debts from conversion of All Current\n" +
                "Assets to Cash.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Current Assets (CA): R");
        current_assets = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Current Liabilities (CL): R");
        current_liabilities = Double.parseDouble(Driver.keyboard.nextLine());

        answer = current_assets/(current_liabilities);
        System.out.println();
        System.out.printf(" · Current Ratio: %.4f times.",answer);
        System.out.println();
        System.out.printf(" · CA : CL =  R%.4f : 1",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
