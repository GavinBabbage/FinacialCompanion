package SolvencyAndNetAssetValue;

import Main.Driver;

public class NetAssetValuePerShare {
//    public static void main(String[] args) {
//        NAV_PerShare();
//    }
    public static double NAV_PerShare(){
        double answer;
        double nav;
        double noOfSharesInIssue;

        System.out.println("\uF0A9 Net Asset Value Per Share");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("[FORMULA: Net asset value / No of shares in issue]");
        System.out.println(" - We use the equity (NAV) Excluding the Non Controlling Shareholders Interest (NCI)");
        System.out.println(" - Based on Historical Cost values obtained from the Statement of Financial Position");
        System.out.print("-------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");

        System.out.print("Net asset value: R");
        nav = Driver.keyboard.nextDouble();

        System.out.print("No of shares in issue: R");
        noOfSharesInIssue = Driver.keyboard.nextDouble();

        answer = nav/(noOfSharesInIssue);

        System.out.println();

        System.out.printf("\uF0A7 Net Asset Value per share: R%.4f",answer);
        System.out.println();
        System.out.println("\n-------------------------------------------------------------------------------");
        return answer;
    }
}
