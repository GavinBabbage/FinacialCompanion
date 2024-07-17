package SustainableGrowthRate;
import Main.*;
public class SustainableGrowthRate {
//    public static void main(String[] args) {
//        SGR();
//    }

    public static double SGR() {
        double answer;
        double roe;
        double retention_ratio;

        System.out.println("\u25A0 Sustainable Growth Rate (SGR) (also known as g) \u25A0");
        System.out.println(" - Maximum rate which a firm can grow without any EXTERNAL FUNDING.");
        System.out.println(" - Maintains Debt / Equity ratio – WITH NO ADDITIONAL financial leverage.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Return on Equity (ROE) x Retention Ratio) x 100]");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Return on Equity (ROE): ");
        roe = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Retention Ratio: ");
        retention_ratio = Double.parseDouble(Driver.keyboard.nextLine());

        answer = (roe * retention_ratio) * 100;
        System.out.println();
        System.out.printf("\u00B7 Sustainable Growth Rate (SGR) (also known as g): %.4f%%", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
