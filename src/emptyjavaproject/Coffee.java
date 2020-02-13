/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;

/**
 *
 * @author jonathan.gabl
 */
public class Coffee extends MenuItem{
    private String name;
    private Size size;
    private Money basePrice;
    public Coffee(String name, Size size, Money basePrice){
        super(name, basePrice);
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }
    @Override
    public String toString(){
        return ("\n"+size + " " + name + ": " + basePrice );
    }

    @Override
    public Money getPrice() {
        return basePrice;
    }

    @Override
    public String getReceiptItem() {
    return ("\n"+size + " " + name);
    }
}
