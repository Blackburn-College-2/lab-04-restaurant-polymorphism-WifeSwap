/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author Gabl
 */
public class Syrup implements Orderable {

    private String flavor;
    private Money price;

    Syrup(String flavor, Money price) {
        this.flavor = flavor;
        this.price = new Money(price.getAmount());
    }
    @Override
    public String getReceiptItem(){
        return flavor + ": " + price.toString();
    }
    @Override
    public Money getPrice(){
        return price;
    }
}
