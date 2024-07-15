package SustainableGrowthRate;

import Main.Driver;

public class SustainableGrowthRate {
//    public static void main(String[] args) {
//        SGR();
//    }

    public static double SGR() {
        double answer;
        double roe;
        double retention_ratio;

        System.out.println("\uF0A5 Sustainable Growth Rate (SGR) (also known as g) \uF0A5");
        System.out.println(" - Maximum rate which a firm can grow without any EXTERNAL FUNDING.");
        System.out.println(" - Maintains Debt / Equity ratio – WITH NO ADDITIONAL financial leverage.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (Return on Equity (ROE) x Retention Ratio) x 100]");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Return on Equity (ROE): ");
        roe = Driver.keyboard.nextDouble();

        System.out.print("Retention Ratio: ");
        retention_ratio = Driver.keyboard.nextDouble();

        answer = (roe * retention_ratio) * 100;
        System.out.println();
        System.out.printf("\uF0A7 Sustainable Growth Rate (SGR) (also known as g): %.4f%%", answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
