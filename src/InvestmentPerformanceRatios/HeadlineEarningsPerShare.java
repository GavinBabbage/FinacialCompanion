package InvestmentPerformanceRatios;

import Main.Driver;

public class HeadlineEarningsPerShare {
//    public static void main(String[] args) {
//        EPS();
//    }
    public static double EPS(){
        double answer;
        double headline_earnings;
        double weighted_no_of_class_A_shares_in_issue;

        System.out.println("\uF0A5 Headline Earnings Per Share (EPS) \uF0A5");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Headline earnings / Weighted No. of Class A shares in issue]");
        System.out.println(" - Primary measure of company performance.");
        System.out.println(" - Measures profitability from the view of the Class A (Ordinary) shareholders.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Headline earnings: R");
        headline_earnings = Driver.keyboard.nextDouble();

        System.out.print("Weighted No. of Class A shares in issue: R");
        weighted_no_of_class_A_shares_in_issue = Driver.keyboard.nextDouble();

        answer = headline_earnings / weighted_no_of_class_A_shares_in_issue;
        System.out.println();
        System.out.printf("\uF0A7 Headline Earnings Per Share (EPS): R%.4f%n",answer);
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
