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
public class Meat implements Orderable {

    private String name;
    private Money price;

    Meat(String flavor, Money price) {
        this.name = flavor;
        this.price = new Money(price.getAmount());
    }
    @Override
    public String getReceiptItem(){
        return name + ": " + price.toString();
    }
    @Override
    public Money getPrice(){
        return price;
    }
}
