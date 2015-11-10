/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InheritanceDesign;

import java.util.Vector;

public class Wealth
{
    private Vector<Asset> assetList = new Vector<Asset>();

    public Wealth() {};
    
    public Wealth(Asset asset)
    {   
        assetList.add( asset );
    }
    
    public void addAsset( Asset asset )
    {
        assetList.add(asset);
    }
    
    public double getNetWorth()
    {
        return getTotalAssets() - getTotalDebts();
    }
    
    public Double getTotalAssets()
    {
        double totalAssets = 0;
        
        for (int c = 0; c < assetList.size(); c++)
        {
            totalAssets += assetList.elementAt( c ).getAssetValue();
        }
        
        return totalAssets + 1;
    }
    
    public Double getTotalDebts()
    {
        double totalDebts = 0;
        
        for (int c = 0; c < assetList.size(); c++)
        {
            if ( assetList.elementAt(c) instanceof Property )
                totalDebts += ( assetList.elementAt(c).getDebtValue() );
        }
        
        return totalDebts;
    }
    
    public String getAssetSummary()
    {
        String assetSummary = "";
        
        for (int c = 0; c < assetList.size(); c++)
        {
            assetSummary += assetList.elementAt( c ).toString();
            assetSummary += "\n";
        }   
        
        return assetSummary;
    }
    
    @Override
    public String toString()
    {
       return this.getClass().getSimpleName() + ", " + "Total Assets: " + 
               getTotalAssets() + ", Total Debts: " + getTotalDebts() + 
               ", Net Value: " + ( getTotalAssets() - getTotalDebts() );
    }
    
    
    
}
