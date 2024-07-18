package Main;

import java.util.HashMap;

public class Glossary {
    public static void main(String[] args) {
        GlossaryLoader();
    }
    public static void GlossaryLoader(){
        System.out.println("\u25A0 Glossary \u25A0");

        HashMap<String,String> glossary = new HashMap<>();
        glossary.put(" \u2043 Account Receivables Days (Collection period)" , "Calculates the Average number of days between the Credit sales and when the Cash is collected from debtors. Assume here that all sales are on credit.");

        glossary.put(" \u2043 Accounts Payables Days (Settlement period)" , "Calculates the Average number of days between the Credit purchases and when the cash is paid to creditors.");

        glossary.put(" \u2043 Days inventory on hand" , "Calculates the average number of days between the purchase (when Risks & rewards of ownership is transferred from purchaser to the seller) and sale of inventory on credit.");

        glossary.put(" \u2043 Inventory Turnover Ratio" , "Calculates the average number of times inventory is sold during the year.");

        glossary.put(" \u2043 Fixed Asset (Non-Current) Turnover" , "Evaluates the use of Fixed assets to generate income.");

        glossary.put(" \u2043 Total Asset Turnover (TAT)" , "Evaluates the use of ALL assets to generate Revenue (Income).");

        glossary.put(" \u2043 Cash Coverage Ratio" , "Ability of the business to pay interest from Operating Cash flows.");

        glossary.put(" \u2043 Cash Flow To Debt Ratio" , "Provides insight into the cash flows from OPERATIONS to repay Debt.");

        glossary.put(" \u2043 Debt Ratio" , "The Debt ratio indicates the percentage of Total assets financed by Total Debt.");

        glossary.put(" \u2043 Debt To Equity Ratio - ALL LIABILITIES" , "The Debt to equity ratio indicates that for every R1 of capital provided by shareholders x cents was provided by ALL liabilities.");

        glossary.put(" \u2043 Debt To Equity Ratio - INTEREST BEARING LIABILITIES" , "The Debt to Equity ratio indicates that for every R1 of capital provided by shareholders x cents was provided by INTEREST BEARING LIABILITIES.");

        glossary.put(" \u2043 Equity Multiplier (EM)" , "Use of debt to lever up returns to shareholders / Exposure to Financial risk.");

        glossary.put(" \u2043 Times Interest Earned Ratio" , "Measures the ability of the business to pay Interest from ACCRUAL Net profits before interest and tax (EBIT)");

        glossary.put(" \u2043 Dividend Cover" , "Indicates number of times the Dividends can be paid out of Current earnings.");

        glossary.put(" \u2043 Dividend Yield (DY)" , "Cash Return shareholders (Class A / Ordinary) earn on their investment in the form of dividends.");

        glossary.put(" \u2043 Earnings Yield (EY) (Inverse of PE)" , "Yield investors are demanding on their investments.");

        glossary.put(" \u2043 Headline Earnings Per Share (EPS)" , "Primary measure of company performance. Measures profitability from the view of the Class A (Ordinary) shareholders.");

        glossary.put(" \u2043 Market Price to Book" , "It shows the value the firm has generated for each R1 invested by shareholders.");

        glossary.put(" \u2043 Market Value Added (MVA)" , "A negative MVA means Market value < Book value.");

        glossary.put(" \u2043 Pay-out Ratio" , "The Pay-out ratio calculates what percentage of Earnings (NPAT) is paid out as Dividends to shareholders.");

        glossary.put(" \u2043 Price Earnings Ratio (P/E)" , "Measures how many times the Share price covers HEADLINE Earnings Per Share (HEPS).");

        glossary.put(" \u2043 Retention Ratio (Ploughback/plowback ratio)" , "Evaluates what amount of profits are retained in the business to finance future growth plans.");

        glossary.put(" \u2043 Return to Shareholder (Holding Period Return (HPR))" , "Overall return to shareholders including both Capital appreciation (P1 – P0) and Cash return (Dividend) of the share.");

        glossary.put(" \u2043 Acid Test Ratio (Quick ratio)" , "Evaluates the ability of the firm to settle short debts /obligations without relying on the sale of Inventory as it only relies on cash and debtors.");

        glossary.put(" \u2043 Current Ratio" , "Evaluates the ability of the firm to settle short debts from conversion of All Current Assets to cash.");

        glossary.put(" \u2043 Gross Margin on Sales" , "The Gross Margin on Sales ratio calculates the amount that is left from every R1 of sales earned after deducting the Cost of Sales Expense.");

        glossary.put(" \u2043 Net Margin (NM)" , "Evaluates operational efficiency in terms of Sales, Cost of Sales, Operating expenses. Measures the amount of net profit generated from total revenue.");

        glossary.put(" \u2043 Operating Profit Margin" , "The Net Operating Profit Margin ratio expresses the Net Profit Before Interest and Tax as a percentage of the Total Sales. Measures the % of Sales Income that is retained after Cost of Sales and Operating expenses are subtracted.");

        glossary.put(" \u2043 Net Profit on Sales after Tax" , "The Net Profit on Sales after Tax ratio expresses the Net Profit AFTER Tax as a percentage of the Total sales.");

        glossary.put(" \u2043 Return on Equity (ROE)" , "The overall measure of the financial success of the firm with respect to increasing shareholders wealth. Return the shareholders earn on investment made at BEGINNING of the year.");

        glossary.put(" \u2043 Return on Total Assets (ROA)" , "ROA evaluates the use of ALL assets to generate income AFTER Interest and Tax.");

        glossary.put(" \u2043 Return on Total Assets (ROA) (EBIT)" , "OA (EBIT) evaluates the use of ALL assets to generate income BEFORE Interest and Tax.");

        glossary.put(" \u2043 Solvency Test" , "Do Total Assets (Fairly valued) exceed Total liabilities)? Yes/No");

        glossary.put(" \u2043 Sustainable Growth Rate (SGR) (also known as g)" , "Maximum rate which a firm can grow without any EXTERNAL FUNDING. Maintains Debt / Equity ratio – WITH NO ADDITIONAL financial leverage.");


        for(String keys : glossary.keySet()){
            System.out.println( keys + "    :    " + glossary.get(keys));
            System.out.println();
        }
    }
}
