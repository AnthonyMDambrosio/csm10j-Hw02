/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/
package InheritanceDesign;

abstract public class Security extends Asset
{
    protected double price; 
    protected double quantity;
    
    public Security (String name, double price, int quantity)
    {
        super( name );
        this.price = price;
        this.quantity = quantity;
    } 
}
