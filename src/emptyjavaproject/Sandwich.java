/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author jonathan.gabl
 */
public class Sandwich implements Orderable  {

    protected Money basePrice;
    private ArrayList<Orderable> contents = new ArrayList();

    public Sandwich(Money basePrice){
        this.basePrice = basePrice;
    }

    public void add(Orderable a) {
        contents.add(a);
        basePrice = basePrice.add(a.getPrice());
    }

    @Override
    public String toString() {
        String item = ("\nSandwich: " + getPrice());
        for (int i = 0; i < contents.size(); i++) {
            item += ("\n\t" + contents.get(i).getReceiptItem());
        }
        return item;
    }

    public Money getPrice() {
        return basePrice;
    }

    public String getReceiptItem() {
        return toString();
    }
}
