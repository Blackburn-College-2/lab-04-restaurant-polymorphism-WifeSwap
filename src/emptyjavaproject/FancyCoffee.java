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
 * @author Gabl
 */
public class FancyCoffee extends Coffee {
    private ArrayList<Orderable> addOn = new ArrayList();
    public FancyCoffee(String name, Size size, Money basePrice){
        super(name,size,basePrice);
    }
    public void add(Orderable a){
        addOn.add(a);
        basePrice = basePrice.add(a.getPrice());
    }
    
    @Override
    public String toString(){
        String item = ("\n"+size + " " + name + ": " + basePrice );
        for (int i = 0; i<addOn.size(); i++) {
            item += ("\n\t" + addOn.get(i).getReceiptItem() );
        }
        return item;
    }

    @Override
    public Money getPrice() {
        return basePrice;
    }

    @Override
    public String getReceiptItem() {
    return toString();
    }
} 
