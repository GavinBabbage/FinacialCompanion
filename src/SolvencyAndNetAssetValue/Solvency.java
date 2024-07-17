package SolvencyAndNetAssetValue;
import Main.*;
public class Solvency {
//    public static void main(String[] args) {
//        SolvencyTest();
//    }
    public static boolean SolvencyTest(){
        System.out.println("\u25A0 Solvency Test \u25A0");
        System.out.print("------------------------------------------------------------------------------\n");
        long total_assets;
        long total_liabilities;
        System.out.println(" - Do Total Assets (Fairly valued) exceed Total liabilities)? Yes/No");
        System.out.print("------------------------------------------------------------------------------\n");
        System.out.println("Please enter the following:");
        boolean solvent = false;
        System.out.print("Total Assets: R");
        total_assets = Driver.keyboard.nextLong();
        System.out.print("Total Liabilities: R");
        total_liabilities = Driver.keyboard.nextLong();
        System.out.println();
        if(total_assets>total_liabilities){
            solvent=true;
            System.out.println("\u00B7 The company IS SOLVENT.");
        }
        else{
            System.out.println("\u00B7 The company is NOT SOLVENT.");
        }
        System.out.println("\n-------------------------------------------------------------------------------");
        return solvent;
    }
}
