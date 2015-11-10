/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InterfaceDesign;

public class BankAccount implements Asset
{
    private String name;
    private double balance;
    
    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    
    @Override
    public double getAssetValue()
    {
        return balance;
    }
    
    @Override 
    public String toString ()
    {
        return this.getClass().getSimpleName() + ", " + name + ", " + balance;
    }
}
