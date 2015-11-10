/******************************************
* Programmer : Anthony D'Ambrosio
* Date       : 11/10/2015
* Purpose    : Net Worth
* Notes      :
******************************************/

import InterfaceDesign.*;

public class Program
{
    public static void main( String[] args )
    {
        Stock stockObj = new Stock("MSFT", 9, 50);
        Bond bondObj = new Bond("U.S", 4, 200);
        BankAccount bankAccountObj = new BankAccount("Chase", 1000);
        House houseObj = new House("Mrs. Dude", 400000, 200000);
        Car carObj = new Car("Rebecca", 3000, 1000);
        Wealth wealthObj = new Wealth();
        
        wealthObj.addAsset( bankAccountObj);
        wealthObj.addAsset( stockObj );
        wealthObj.addAsset( bondObj );
        wealthObj.addAsset( houseObj );
        wealthObj.addDebt( houseObj ); // for interface
        wealthObj.addAsset( carObj );
        wealthObj.addDebt( carObj ); // for interface
        
        
        System.out.println(wealthObj);
        System.out.println();
        System.out.println(wealthObj.getAssetsSummary()); // for interface
        System.out.println(bankAccountObj);
        System.out.println(stockObj);
        System.out.println(bondObj);
        System.out.println(houseObj);
        System.out.println(carObj);
        
    }
}
