/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InheritanceDesign;

abstract public class Property extends Asset
{
    private double propertyValue;
    private double propertyDebt;
    
    public Property( String name, double propertyValue, double propertyDebt )
    {
        super( name );
        this.propertyValue = propertyValue;
        this.propertyDebt = propertyDebt;
    }
    
    public double getValueAmount()
    {
        return propertyValue;
    }
    
    public double getDebtAmount()
    {
        return propertyDebt;
    }
}
