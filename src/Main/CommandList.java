package Main;

import AssetTurnoverRatios.FixedAssetTurnover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CommandList {
  public static void main(String[] args) {
    Commands();
  }
  public static void Commands(){
    System.out.println(" \u25A0 Command List \u25A0" );

    HashMap<String,String> commands = new HashMap<>();
    commands.put(" \u2043 Account Receivables Days (Collection period)" , "ard ; collection ; account receivable ; account receivables ; accounts receivable ; accounts receivables ; trade receivable ; trade receivables ; account receivable days ; account receivables days ; accounts receivable days ; accounts receivables days ; trade receivable days ; trade receivables days ; trades receivable days ; trades receivables days ; collection period");

    commands.put(" \u2043 Accounts Payables Days (Settlement period)" , "apd ; settlement ; account payable ; account payables ; accounts payable ; accounts payables ; trade payable ; trade payables ; account payable days ; account payables days ; accounts payable days ; accounts payables days ; trade payable days ; trade payables days ; trades payable days ; trades payables days ; settlement period");

    commands.put(" \u2043 Days inventory on hand" , "dioh ; days inventory ; days inventory on hand");

    commands.put(" \u2043 Inventory Turnover Ratio" , "itr ; inventory turnover ; inventory turnover ratio");

    commands.put(" \u2043 Fixed Asset (Non-Current) Turnover" , "fixed asset ; non-current ; non current ; non-current asset ; non current asset ; fixed asset turnover ; non-current asset turnover ; non current asset turnover");
    
    commands.put(" \u2043 Total Asset Turnover (TAT)" , "tat ; total asset ; total asset turnover ; total asset turnover ratio");
    
    commands.put(" \u2043 Cash Coverage Ratio" , "cash ; cash ratio ; cash coverage ; cash coverage ratio");
    
    commands.put(" \u2043 Cash Flow To Debt Ratio" , "cash/debt ; cash/debt ratio ; cash to debt ; cash to debt ratio ; cash-to-debt ; cash-to-debt ratio ; cash flow to debt ratio ; cash-flow-to-debt-ratio");
    
    commands.put(" \u2043 Debt Ratio" , "debt ; debt ratio" );

    commands.put(" \u2043 Debt To Equity Ratio - ALL LIABILITIES" , "d/e -all ; d/e ratio -all ; d to e -all ; d to e ratio -all ; d-to-e -all ; d-to-e ratio -all ; debt/equity -all ; debt/equity ratio -all ; debt to equity -all ; debt to equity ratio -all ; debt-to-equity -all ; debt-to-equity ratio -all");
    
    commands.put(" \u2043 Debt To Equity Ratio - INTEREST BEARING LIABILITIES" , "d/e -interest ; d/e ratio -interest ; d to e -interest ; d to e ratio -interest ; d-to-e -interest ; d-to-e ratio -interest ; debt/equity -interest ; debt/equity ratio -interest ; debt to equity -interest ; debt to equity ratio -interest ; debt-to-equity -interest ; debt-to-equity ratio -interest");
    
    commands.put(" \u2043 Equity Multiplier (EM)" , "em ; equity multiplier" );

    commands.put(" \u2043 Times Interest Earned Ratio" , "times ; times interest ; times interest earned ; times interest earned ratio");
    
    commands.put(" \u2043 Dividend Cover" , "dc ; dividend cover" );

    commands.put(" \u2043 Dividend Yield (DY)" , "dy ; dividend yield" );

    commands.put(" \u2043 Earnings Yield (EY) (Inverse of PE)" , "ey ; earning yield ; earnings yield");
    
    commands.put(" \u2043 Headline Earnings Per Share (EPS)" , "eps ; Headline Earnings Per Share ; Headline Earnings/Share ; Earnings Per Share ; Earnings/Share");
    
    commands.put(" \u2043 Market Price to Book (using Market Capitalisation)" , "mpb -market cap ; mpb -market capitalisation ; market price to book -market cap ; market price to book -market capitalisation");
    
    commands.put(" \u2043 Market Price to Book (Using Share price)" , "mpb -share ; mpb -share price ; market price to book -share ; market price to book -share price");
    
    commands.put(" \u2043 Market Value Added (MVA)" , "mva ; market value added" );

    commands.put(" \u2043 Market Value Added (MVA) PER SHARE" , "mva/share ; mva per share ; market value added/share ; market value added per share");
    
    commands.put(" \u2043 Pay-out Ratio" , "p-out ; payout ; payout ratio ; pay-out ; pay-out ratio ; pay out ; pay out ratio");
    
    commands.put(" \u2043 Price Earnings Ratio (P/E)" , "p/e ; p/e ratio ; pe ; pe ratio ; price earnings ; price earnings ratio");
    
    commands.put(" \u2043 Retention Ratio (Ploughback/plowback ratio)" , "retention ; retention ratio ; ploughback ; ploughback ratio ; plowback ; plowback ratio");
    
    commands.put(" \u2043 Return to Shareholder (Holding Period Return (HPR))" , "hpr ; holding period return ; rts ; return to shareholder");
    
    commands.put(" \u2043 Acid Test Ratio (Quick ratio)" , "acid ; quick ; acid ratio ; quick ratio ; acid test ratio");
    
    commands.put(" \u2043 Current Ratio" , "current ; current ratio" );

    commands.put(" \u2043 Gross Margin on Sales" , "gross margin ; gross margin ratio ; gross margin/sales ; gross margin/sales ratio ; gross margin on sales ; gross margin on sales ratio");
    
    commands.put(" \u2043 Net Margin (NM)" , "nm ; net margin" );

    commands.put(" \u2043 Operating Profit Margin" , "npbit margin ; npbit/revenue ; npbit/sales ; net profit -before tax ; net profit margin -before tax ; operating profit -before tax ; operating profit margin -before tax ; net operating profit -before tax ; net operating profit margin -before tax");
    
    commands.put(" \u2043 Net Profit on Sales after Tax" , "npat margin ; npat/revenue ; npat/sales ; net profit -after tax ; net profit on sales -after tax ; operating profit -after tax ; operating profit margin -after tax ; net operating profit -after tax ; net operating profit margin -after tax");
    
    commands.put(" \u2043 Return on Equity (ROE)" , "roe ; return on equity" );

    commands.put(" \u2043 Return on Total Assets (ROA)" , "roa -all ; return on assets -all" );

    commands.put(" \u2043 Return on Total Assets (ROA) (EBIT)" , "roa -ebit ; return on assets -ebit" );

    commands.put(" \u2043 Solvency Test" , "sol ; solvency ; solvency test");
    
    commands.put(" \u2043 Sustainable Growth Rate (SGR) (also known as g)" , "sgr ; sustainable growth ; sustainable growth rate ; g ; growth ; growth rate");
    
    commands.put(" \u2043 Du Pont Analysis" , "dupont ; dupont analysis ; du pont ; du pont analysis");
    
    commands.put(" \u2043 Net Asset Value Per Share" , "net Asset value per share ; nav per share ; nav/share");

    commands.put(" \u2043 Command List" , "cmd ; commands ; help ; command list");

    commands.put(" \u2043 Glossary" , "glossary ; gloss ; dictionary ; dict");
    
    commands.put(" \u2043 Exit / Quit" , "q ; quit ; exit ; done");

    List<String> sortedKeys = new ArrayList<>(commands.keySet());


    Collections.sort(sortedKeys);
    for(String keys : sortedKeys){
      System.out.println(keys + "  :  " + commands.get(keys));
      System.out.println();
    }
  }
}
