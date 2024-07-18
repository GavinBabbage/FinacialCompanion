package InvestmentPerformanceRatios;
import Main.*;
public class PayOutRatio {
//    public static void main(String[] args) {
//        PayOut();
//    }
    public static double PayOut(){
        double answer;
        double dividends_per_share;
        double headline_earnings_per_share;

        System.out.println("■ Pay-out Ratio ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Dividends per share x 100 / HEADLINE Earnings per share]");
        System.out.println(" - The Pay-out ratio calculates what percentage of Earnings (NPAT) is paid out\n" +
                           "   as Dividends to shareholders.");
        System.out.println(" - Retention of profits to finance investment in future Projects (Assets) to\n" +
                           "   Maintain or Expand operations (Investing Activities - CFS).");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Dividends per share: R");
        dividends_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("HEADLINE Earnings per share: R");
        headline_earnings_per_share = Double.parseDouble(Driver.keyboard.nextLine());

        answer = dividends_per_share * 100 / headline_earnings_per_share;
        System.out.println();
        System.out.printf(" · Headline Earnings Per Share (EPS): %.4f%%%n",answer);
        System.out.printf(" · Retention Ratio = %.4f%%%n",100 - answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
