/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InterfaceDesign;

public class Car implements Debt, Asset
{
    private String name;
    private double value, debt;
    
    public Car(String name, double value, double debt)
    {
        this.name = name;
        this.value = value;
        this.debt = debt;
    }
    
    @Override
    public double getDebtAmount()
    {
        return debt;
    }
    
    @Override
    public double getAssetValue()
    {
        return value;
    }
    
    @Override 
    public String toString ()
    {
        return this.getClass().getSimpleName() + ", Value: " + value + 
                ", Debt: " + debt + ", Net value: " + ( value - debt );
    }
}
