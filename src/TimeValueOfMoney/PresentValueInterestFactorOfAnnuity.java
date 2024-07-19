package TimeValueOfMoney;

import Main.Driver;

public class PresentValueInterestFactorOfAnnuity {
    public static double presentValueInterestFactorOfAnnuity() {
        double answer;
        double interest_rate_perPeriod;
        int number_of_periods;

        System.out.println("■ Present Value Interest Factor of Annuity (PVIFA) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: (1 - (1 + r) ^ -n) / r]");
        System.out.println(" - Evaluates the present value of a series of equal cash flows (annuity).");

        System.out.println();
        System.out.println(" · A higher PVIFA indicates higher present value for the same amount of\n" +
                           "   cash flows.");
        System.out.println(" · Reasons:\n" +
                           "     ‣ Lower discount rate.\n" +
                           "     ‣ More time until the final payment.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Interest Rate per Period (r): ");
        interest_rate_perPeriod = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        number_of_periods = Integer.parseInt(Driver.keyboard.nextLine());

        answer = (1 - Math.pow(1 + interest_rate_perPeriod, - number_of_periods)) / interest_rate_perPeriod;

        System.out.println();
        System.out.printf(" · Present Value Interest Factor of Annuity (PVIFA): %.4f", answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");

        return answer;
    }
}
