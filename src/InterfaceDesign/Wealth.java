/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InterfaceDesign;

import java.util.Vector;

public class Wealth
{
    private Vector<Debt> debtList = new Vector<Debt>();
    private Vector<Asset> assetList = new Vector<Asset>();
    
    public Wealth() {};
    
    public void addAsset(Asset asset)
    {
        assetList.add( asset );
    }
    
    public void addDebt(Debt debt)
    {
        debtList.add( debt );
    }
    
    public double getNetWorth()
    {
        return ( getTotalAssets() - getTotalDebts() );
    }
    
    public double getTotalAssets()
    {
        double totalAssets = 0;
        for (int c = 0; c < ( assetList.size() ); c++)
        {
            totalAssets += assetList.elementAt( c ).getAssetValue();
        }
        return totalAssets;
    }
    
    public double getTotalDebts()
    {
        double totalDebts = 0;
        for (int c = 0; c < ( debtList.size() ); c++)
        {
            totalDebts += debtList.elementAt( c ).getDebtAmount();
        }
        return totalDebts;   
    }
    
    public String getAssetsSummary()
    {
        String summary = "";
        for ( int c = 0; c < assetList.size(); c++ )
        {
            summary += ( assetList.elementAt( c ) );
            summary += "\n";
        }
        
        return summary;
    }
    
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + ", Total Assets: " + 
                getTotalAssets() + ", Total Debts: " + getTotalDebts() +
                ", Net Value: " + getNetWorth();
    }
}
