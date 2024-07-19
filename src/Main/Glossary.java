package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Glossary {
//    public static void main(String[] args) {
//        define();
//    }

    public static void define() {
        System.out.println("■ Glossary ■" );

        HashMap<String, String> definitions = new HashMap<>();
        definitions.put(" - Account Receivables Days (Collection period)", "The average number of days it takes for a company to collect its accounts receivable. This period indicates the efficiency of a company's credit and collection policies.");
        definitions.put(" - Accounts Payables Days (Settlement period)", "The average number of days a company takes to pay its suppliers. This period indicates the efficiency of a company's payables management.");
        definitions.put(" - Days Inventory on Hand (DIOH)", "A financial ratio that indicates the average number of days a company holds inventory before selling it.");
        definitions.put(" - Inventory Turnover Ratio", "A ratio showing how many times a company's inventory is sold and replaced over a period.");
        definitions.put(" - Fixed Asset (Non-Current) Turnover", "A financial ratio that measures how efficiently a company uses its fixed assets to generate sales.");
        definitions.put(" - Cash Coverage Ratio", "A ratio that measures a company's ability to pay interest and other obligations from its cash flow.");
        definitions.put(" - Cash Flow To Debt Ratio", "A measure of a company’s ability to cover its total debt with its yearly cash flow from operations.");
        definitions.put(" - Debt Ratio", "A ratio that measures the extent of a company's leverage by comparing total debt to total assets.");
        definitions.put(" - Debt To Equity Ratio (All Liabilities)", "A ratio that compares a company's total liabilities to its shareholder equity, indicating how much debt is used to finance assets.");
        definitions.put(" - Debt To Equity Ratio (Interest Bearing Liabilities)", "Similar to the Debt to Equity Ratio, but considers only interest-bearing liabilities.");
        definitions.put(" - Equity Multiplier (EM)", "A financial leverage ratio that measures the proportion of a company’s assets that are financed by its shareholders' equity.");
        definitions.put(" - Times Interest Earned Ratio", "A ratio that measures a company's ability to meet its debt obligations based on its current income.");
        definitions.put(" - Dividend Cover", "A ratio that shows how many times a company can pay dividends to its shareholders with its net income.");
        definitions.put(" - Dividend Yield (DY)", "A financial ratio that shows how much a company pays out in dividends each year relative to its stock price.");
        definitions.put(" - Earnings Yield (EY)", "The inverse of the price-earnings ratio, representing the percentage of each dollar invested in the stock that was earned by the company.");
        definitions.put(" - Headline Earnings Per Share (EPS)", "A measure of a company's profitability, calculated by dividing the company's net income by its total number of outstanding shares.");
        definitions.put(" - Market Price to Book (Using Market Capitalization)", "A ratio used to compare a company's market value to its book value using market capitalization.");
        definitions.put(" - Market Price to Book (Using Share Price)", "A ratio used to compare a company's market value to its book value using the share price.");
        definitions.put(" - Market Value Added (MVA)", "A measure of the value a company has added to its shareholders' investments over time.");
        definitions.put(" - Market Value Added (MVA) Per Share", "Similar to MVA, but on a per-share basis.");
        definitions.put(" - Pay-out Ratio", "A ratio that shows the proportion of earnings a company pays to its shareholders in the form of dividends.");
        definitions.put(" - Price Earnings Ratio (P/E)", "A ratio for valuing a company that measures its current share price relative to its per-share earnings.");
        definitions.put(" - Retention Ratio (Ploughback/Plowback Ratio)", "The proportion of net earnings that is retained in the business rather than paid out as dividends.");
        definitions.put(" - Return to Shareholder (Holding Period Return (HPR))", "The total return received from holding an asset or portfolio of assets over a period.");
        definitions.put(" - Acid Test Ratio (Quick Ratio)", "A measure of a company's short-term liquidity, indicating its ability to pay off its current liabilities without relying on the sale of inventory.");
        definitions.put(" - Current Ratio", "A liquidity ratio that measures a company's ability to pay short-term obligations with its current assets.");
        definitions.put(" - Gross Margin on Sales", "A financial metric that shows the proportion of money left over from revenues after accounting for the cost of goods sold.");
        definitions.put(" - Net Margin (NM)", "A ratio that shows the percentage of revenue that remains as profit after all expenses are deducted.");
        definitions.put(" - Operating Profit Margin", "A profitability ratio that shows what percentage of a company's revenue is left over after paying for variable costs of production.");
        definitions.put(" - Net Profit on Sales after Tax", "A profitability ratio that shows what percentage of revenue is left over after all expenses and taxes are deducted.");
        definitions.put(" - Return on Equity (ROE)", "A measure of financial performance that calculates the amount of net income returned as a percentage of shareholders equity.");
        definitions.put(" - Return on Total Assets (ROA)", "A ratio that measures a company's profitability by comparing its net profit to its total assets.");
        definitions.put(" - Return on Total Assets (ROA) (EBIT)", "ROA (EBIT) evaluates the use of ALL assets to generate income BEFORE Interest and Tax.");
        definitions.put(" - Solvency Test", "An assessment of a company's ability to meet its long-term obligations and continue operations in the future.");
        definitions.put(" - Sustainable Growth Rate (SGR)", "The maximum rate at which a company can grow its sales, earnings, and dividends while maintaining its existing financial structure.");
        definitions.put(" - Du Pont Analysis", "A method of performance measurement that breaks down return on equity into its component parts to better understand what drives ROE.");
        definitions.put(" - Net Asset Value Per Share", "The value of a company's assets minus its liabilities, divided by the number of outstanding shares.");
        definitions.put(" - Present Value (PV)", "The current value of a future sum of money or stream of cash flows, given a specified rate of return.");
        definitions.put(" - Present Value of Annuity (PVA)", "The current value of a series of future annuity payments, discounted at a specific interest rate.");
        definitions.put(" - Present Value of Perpetuity", "The present value of an infinite series of future payments.");
        definitions.put(" - Present Value of Annuity Due", "The current value of a series of future annuity payments that are made at the beginning of each period.");
        definitions.put(" - Present Value of Delayed Annuity", "The present value of an annuity that starts after a certain period.");
        definitions.put(" - Present Value For Withdrawal", "The amount needed today to allow for withdrawals at a future date.");
        definitions.put(" - Present Value of Ordinary Annuity", "The present value of a series of equal payments made at the end of consecutive periods.");
        definitions.put(" - Future Value (FV)", "The value of an asset or cash at a specified date in the future that is equivalent in value to a specified sum today.");
        definitions.put(" - Future Value of Annuity (FVA)", "The value of a series of equal cash flows at a specific date in the future.");
        definitions.put(" - Future Value of Ordinary Annuity", "The future value of a series of equal payments made at the end of each period.");
        definitions.put(" - Future Value of Annuity Due", "The future value of a series of equal payments made at the beginning of each period.");
        definitions.put(" - Future Value of Growing Perpetuity", "The future value of a perpetuity that grows at a constant rate indefinitely.");
        definitions.put(" - Growing Perpetuity", "A series of payments that continue indefinitely and grow at a constant rate.");
        definitions.put(" - Interest Rate", "The percentage of a sum of money charged for its use.");
        definitions.put(" - Loan Installment", "A scheduled payment to repay borrowed money over time.");
        definitions.put(" - Simple Interest", "Interest calculated only on the principal amount, or on that portion of the principal amount that remains unpaid.");
        definitions.put(" - Time to Reach Future Value", "The amount of time it takes for an investment to reach a desired future value.");
        definitions.put(" - Macaulay Duration", "Duration measures the sensitivity of the price of a bond or other debt instrument to changes in interest rates. It is the weighted average time until a bond's cash flows are received, discounted to present value.");
        definitions.put(" - Bond Convexity", "A measure of the curvature in the relationship between bond prices and bond yields.");
        definitions.put(" - Annual Percentage Rate (APR)", "APR represents the annualized interest rate charged or earned on an investment, loan, or deposit, including any fees or additional costs associated with the transaction.");
        definitions.put(" - Compound Annual Growth Rate (CAGR)", "CAGR is the rate at which an investment grows annually to reach a given end value, assuming the profits are reinvested at the end of each period.");
        definitions.put(" - Compound Interest", "Interest on a loan or deposit calculated based on both the initial principal and the accumulated interest from previous periods.");
        definitions.put(" - Continuous Compounding", "Continuous Compounding refers to the process of calculating interest that is compounded continuously over a period of time.");
        definitions.put(" - Effective Annual Rate (EAR)", "EAR is the annual interest rate that takes into account the effects of compounding over a given period of time.");
        definitions.put(" - Future Value Interest Factor of Annuity (FVIFA)", "The Future Value Interest Factor of Annuity (FVIFA) calculates the future value of a series of equal cash flows, compounded at a given rate. It helps in determining the future value of an annuity.");
        definitions.put(" - Present Value Interest Factor of Annuity (PVIFA)", "The Present Value Interest Factor of Annuity (PVIFA) calculates the present value of a series of equal cash flows, discounted at a given rate. It helps in determining the present value of an annuity.");
        definitions.put(" - Current Yield", "Current Yield is a financial ratio that measures the annual return on a bond as a percentage of its current market price.");
        definitions.put(" - Bond Price", "Bond Price refers to the present value of the bond's future cash flows, including both coupon payments and the face value, discounted at the market interest rate.");

        List<String> sortedKeys = new ArrayList<>(definitions.keySet());
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            System.out.println(key + " : " + definitions.get(key));
        }
    }
}
