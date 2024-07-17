package Main;

import AssetManagement.*;
import AssetTurnoverRatios.*;
import DuPontAnalysis.*;
import FinancialLeverageRatios.*;
import InvestmentPerformanceRatios.*;
import LiquidityRatios.*;
import ProfitabilityRatios.*;
import SolvencyAndNetAssetValue.*;
import SustainableGrowthRate.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class Driver {
    public static Scanner keyboard = new Scanner(System.in);
    private static String trigger = "";
    private static String input = "";
    public static void main(String[] args) {

        System.out.println("\u25A0 Welcome to the Finance Companion Application! \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        while(!trigger.toLowerCase().startsWith("q")){
            InputLooper();
//            Switcher(trigger);
        }

    }


    public static void InputLooper(){
        System.out.print("What would you like to calculate? : ");
//        input = keyboard.nextLine().toLowerCase().trim();
        trigger = keyboard.nextLine().toLowerCase().trim();
        Switcher(trigger);
        System.out.println();
    }


    public static void Switcher(String command) {
        switch (command) {
            case "sol":
            case "solvency":
            case "solvency test":
                Solvency.SolvencyTest();
                break;

            case "net Asset value per share":
            case "nav per share":
            case "nav/share":
                NetAssetValuePerShare.NAV_PerShare();
                break;

            case "current":
            case "current ratio":
                CurrentRatio.Current();
                break;

            case "acid":
            case "quick":
            case "acid ratio":
            case "quick ratio":
            case "acid test ratio":
                AcidTestRatio.AcidTest();
                break;

            case "dioh":
            case "days inventory":
            case "days inventory on hand":
                DaysInventoryOnHand.DaysInventory();
                break;

            case "itr":
            case "inventory turnover":
            case "inventory turnover ratio":
                InventoryTurnoverRatio.InventoryTurnover();
                break;

            case "ard":
            case "collection":
            case "account receivable":
            case "account receivables":
            case "accounts receivable":
            case "accounts receivables":
            case "trade receivable":
            case "trade receivables":
            case "account receivable days":
            case "account receivables days":
            case "accounts receivable days":
            case "accounts receivables days":
            case "trade receivable days":
            case "trade receivables days":
            case "trades receivable days":
            case "trades receivables days":
            case "collection period":
                AccountReceivablesDays.CollectionPeriod();
                break;

            case "apd":
            case "settlement":
            case "account payable":
            case "account payables":
            case "accounts payable":
            case "accounts payables":
            case "trade payable":
            case "trade payables":
            case "account payable days":
            case "account payables days":
            case "accounts payable days":
            case "accounts payables days":
            case "trade payable days":
            case "trade payables days":
            case "trades payable days":
            case "trades payables days":
            case "settlement period":
                AccountsPayablesDays.SettlementPeriod();
                break;

            case "tat":
            case "total asset":
            case "total asset turnover":
            case "total asset turnover ratio":
                TotalAssetTurnoverRatio.TotalAssetTurnover();
                break;

            case "fixed asset":
            case "non-current":
            case "non current":
            case "non-current asset":
            case "non current asset":
            case "fixed asset turnover":
            case "non-current asset turnover":
            case "non current asset turnover":
                FixedAssetTurnover.NonCurrentTurnover();
                break;

            case "debt":
            case "debt ratio":
                DebtRatio.Debt();
                break;

            case "d/e -all":
            case "d/e ratio -all":
            case "d to e -all":
            case "d to e ratio -all":
            case "d-to-e -all":
            case "d-to-e ratio -all":
            case "debt/equity -all":
            case "debt/equity ratio -all":
            case "debt to equity -all":
            case "debt to equity ratio -all":
            case "debt-to-equity -all":
            case "debt-to-equity ratio -all":
                DebtToEquityRatioAllLiabilities.DebtToEquityAll();
                break;

            case "d/e -interest":
            case "d/e ratio -interest":
            case "d to e -interest":
            case "d to e ratio -interest":
            case "d-to-e -interest":
            case "d-to-e ratio -interest":
            case "debt/equity -interest":
            case "debt/equity ratio -interest":
            case "debt to equity -interest":
            case "debt to equity ratio -interest":
            case "debt-to-equity -interest":
            case "debt-to-equity ratio -interest":
                DebtToEquityRatioInterestBearingLiabilities.DebtToEquityInterest();
                break;

            case "times":
            case "times interest":
            case "times interest earned":
            case "times interest earned ratio":
                TimesInterestEarnedRatio.TimesInterestEarned();
                break;

            case "cash":
            case "cash ratio":
            case "cash coverage":
            case "cash coverage ratio":
                CashCoverageRatio.CashCoverage();
                break;

            case "cash/debt":
            case "cash/debt ratio":
            case "cash to debt":
            case "cash to debt ratio":
            case "cash-to-debt":
            case "cash-to-debt ratio":
            case "cash flow to debt ratio":
            case "cash-flow-to-debt-ratio":
                CashFlowToDebtRatio.CashFlowToDebt();
                break;

            case "em":
            case "equity multiplier":
                EquityMultiplier.EM();
                break;

            case "gross margin":
            case "gross margin ratio":
            case "gross margin/sales":
            case "gross margin/sales ratio":
            case "gross margin on sales":
            case "gross margin on sales ratio":
                GrossMarginOnSales.GrossMargin();
                break;

            case "npbit margin":
            case "npbit/revenue":
            case "npbit/sales":
            case "net profit -before tax":
            case "net profit margin -before tax":
            case "operating profit -before tax":
            case "operating profit margin -before tax":
            case "net operating profit -before tax":
            case "net operating profit margin -before tax":
                NetOperatingProfitMargin.OperatingProfitMargin();
                break;

            case "npat margin":
            case "npat/revenue":
            case "npat/sales":
            case "net profit -after tax":
            case "net profit on sales -after tax":
            case "operating profit -after tax":
            case "operating profit margin -after tax":
            case "net operating profit -after tax":
            case "net operating profit margin -after tax":
                NetProfitOnSalesAfterTax.OperatingProfitOnSalesAfterTax();
                break;

            case "roa -ebit":
            case "return on assets -ebit":
                ReturnOnTotalAssetsEBIT.ROA_EBIT();
                break;

            case "roa -all":
            case "return on assets -all":
                ReturnOnTotalAssets.ROA();
                break;

            case "roe":
            case "return on equity":
                ReturnOnEquity.ROE();
                break;

            case "nm":
            case "net margin":
                NetMargin.NM();
                break;

            case "dy":
            case "dividend yield":
                DividendYield.DY();
                break;

            case "eps":
            case "Headline Earnings Per Share":
            case "Headline Earnings/Share":
            case "Earnings Per Share":
            case "Earnings/Share":
                HeadlineEarningsPerShare.EPS();
                break;


            case "dc":
            case "dividend cover":
                DividendCover.DC();
                break;

            case "p-out":
            case "payout":
            case "payout ratio":
            case "pay-out":
            case "pay-out ratio":
            case "pay out":
            case "pay out ratio":
                PayOutRatio.PayOut();
                break;

            case "retention":
            case "retention ratio":
            case "ploughback":
            case "ploughback ratio":
            case "plowback":
            case "plowback ratio":
                RetentionRatio.Retention();
                break;

            case "hpr":
            case "holding period return":
            case "rts":
            case "return to shareholder":
                ReturnToShareholder.HoldingPeriodReturn();
                break;

            case "p/e":
            case "p/e ratio":
            case "pe":
            case "pe ratio":
            case "price earnings":
            case "price earnings ratio":
                PriceEarningsRatio.PE_Ratio();
                break;

            case "ey":
            case "earning yield":
            case "earnings yield":
                EarningsYield.EY();
                break;

            case "mva":
            case "market value added ":
                MarketValueAdded.MVA();
                break;

            case "mva/share":
            case "mva per share":
            case "market value added/share":
            case "market value added per share":
                MarketValueAddedPERSHARE.MVA_PERSHARE();
                break;

            case "mpb -market cap":
            case "mpb -market capitalisation":
            case "market price to book -market cap":
            case "market price to book -market capitalisation":
                MarketPriceToBookUsingMarketCap.MarketPriceToBook_MarketCap();
                break;

            case "mpb -share":
            case "mpb -share price":
            case "market price to book -share":
            case "market price to book -share price":
                MarketPriceToBookUsingSharePrice.MarketPriceToBook_SharePrice();
                break;

            case "sgr":
            case "sustainable growth":
            case "sustainable growth rate":
            case "g":
            case "growth":
            case "growth rate":
                SustainableGrowthRate.SGR();
                break;

            case "dupont":
            case "dupont analysis":
            case "du pont":
            case "du pont analysis":
                DuPontAnalysis.DuPont();
                break;

            case "":
                break;

            case "q":
            case "quit":
            case "exit":
            case "done":
                System.out.print("Are you sure you want to quit? Y/N : ");
                String s = keyboard.nextLine().trim();
                if(s.toLowerCase().startsWith("y")){
                    System.out.println("Goodbye!");
                    exit(0);
                }
                else{
                    System.out.println(s);
                    trigger = "";
                    input = "";
                }
                break;

            default:
                System.out.println("Unknown command. Please try again.");
                break;
        }
    }
}