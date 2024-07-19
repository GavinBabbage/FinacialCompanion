package TimeValueOfMoney;

import Main.Driver;

public class FutureValueInterestFactorOfAnnuity {
    public static double futureValueInterestFactorOfAnnuity() {
        double answer;
        double interest_rate_perPeriod;
        int number_of_periods;

        System.out.println("■ Future Value Interest Factor of Annuity (FVIFA) ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: ((1 + r) ^ n - 1) / r]");
        System.out.println(" - Evaluates the future value of a series of equal cash flows (annuity).");

        System.out.println();
        System.out.println(" · A higher FVIFA indicates higher future value for the same amount of cash\n" +
                           "   flows.");
        System.out.println(" · Reasons:\n" +
                           "     ‣ Higher discount rate.\n" +
                           "     ‣ More time until the final payment.");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Interest Rate per Period (r): ");
        interest_rate_perPeriod = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Periods (n): ");
        number_of_periods = Integer.parseInt(Driver.keyboard.nextLine());

        answer = (Math.pow(1 + interest_rate_perPeriod, number_of_periods) - 1) / interest_rate_perPeriod;

        System.out.println();
        System.out.printf(" · Future Value Interest Factor of Annuity (FVIFA): %.4f", answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");

        return answer;
    }
}
