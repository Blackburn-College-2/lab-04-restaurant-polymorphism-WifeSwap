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
public class Topping implements Orderable {

    private String type;
    private Money price;

    Topping(String flavor, Money price) {
        this.type = flavor;
        this.price = new Money(price.getAmount());
    }
    @Override
    public String getReceiptItem(){
        return type + ": " + price.toString();
    }
    @Override
    public Money getPrice(){
        return price;
    }
}
