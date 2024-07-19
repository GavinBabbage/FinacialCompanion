package TimeValueOfMoney;

import Main.Driver;

public class LoanInstallment {
    public static double Installment() {
        double loanAmount;
        double annualInterestRate;
        int years;
        int compoundingPeriodsPerYear;
        double payment;

        System.out.println("■ Loan Installment ■");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: PMT = (PV × (r/m)) / (1 - (1 + r/m)^(-n × m))]");
        System.out.println(" - Calculates the quarterly installment for a loan.");
        System.out.print("------------------------------------------------------------------------------\n");

        System.out.print("Loan Amount (PV): R");
        loanAmount = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Annual Interest Rate (r) (as a decimal): ");
        annualInterestRate = Double.parseDouble(Driver.keyboard.nextLine());

        System.out.print("Number of Years (n): ");
        years = Integer.parseInt(Driver.keyboard.nextLine());

        System.out.print("Number of Compounding Periods per Year (m): ");
        compoundingPeriodsPerYear = Integer.parseInt(Driver.keyboard.nextLine());

        double periodicRate = annualInterestRate / compoundingPeriodsPerYear;
        int totalPayments = years * compoundingPeriodsPerYear;

        double denominator = 1 - Math.pow(1 + periodicRate, -totalPayments);
        payment = (loanAmount * periodicRate) / denominator;

        System.out.println();
        System.out.printf(" · Periodic Installment: R%.2f", payment);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return payment;
    }
}
