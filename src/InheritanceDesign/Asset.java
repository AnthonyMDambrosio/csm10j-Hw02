/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InheritanceDesign;

abstract public class Asset
{
    protected String name;
    
    public Asset ( String name )
    {   
        this.name = name;
    }
    
    abstract public double getAssetValue();
    
    abstract public double getDebtValue();
    
}
