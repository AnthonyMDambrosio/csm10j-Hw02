/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InterfaceDesign;

public class Bond implements Asset
{
    private String name;
    private int shares;
    private double value;
    
    public Bond(String name, int shares, double value)
    {
        this.name = name;
        this.shares = shares;
        this.value = value;
    }
    
    @Override
    public double getAssetValue()
    {
        return shares * value;
    }
    
    @Override 
    public String toString ()
    {
        return this.getClass().getSimpleName() + ", " + name + ", Shares: " 
                + shares + ", Worth: " + value + ", Total: " + 
                ( shares * value );
    }
    
}
