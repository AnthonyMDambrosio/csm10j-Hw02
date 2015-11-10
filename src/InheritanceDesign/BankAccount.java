/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InheritanceDesign;

public class BankAccount extends Asset
{
    private double balance;

    public BankAccount( String name, double balance )
    {
        super( name );
        this.balance = balance;
    }
    
    @Override 
    public double getAssetValue()
    {
        return balance;
    }
    
    @Override
    public double getDebtValue() 
    {
        double dummy = 0; 
        return dummy;
    }
    
    @Override 
    public String toString()
    {
        return this.getClass().getSimpleName() + ", Balance: " + balance;
    }
}
