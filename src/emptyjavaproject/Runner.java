/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Currency;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        // TODO code application logic here        
        Money price = new Money(4.50);
        Coffee drink = new Coffee("Covfefe", new Size("Large"), price);
        receipt.add(drink);
        
        Money price5 = new Money(10.30);
        FancyCoffee drink5 = new FancyCoffee("Frappechino", new Size("Small"), price5);
        Money price6 = new Money(1.00);
        drink5.add(new Syrup("Chocolate",price6));
        drink5.add(new Syrup("Caramel",price6));
        drink5.add(new Syrup("Pure Sugar",price6));
        receipt.add(drink5);
        
        Money price7 = new Money(1);
        Money price8 = new Money(1.5);
        Money price9 = new Money(.5);
        
        Sandwich sandwich = new Sandwich(price7);
        sandwich.add(new Meat("Ham", price8));
        sandwich.add(new Meat("Turkey", price9));
        sandwich.add(new Topping("Lettuce", price8));
        sandwich.add(new Topping("Ham", price9));
        receipt.add(sandwich);
       
        
        System.out.println(receipt.prepare());
        System.out.println("Total: "+receipt.getTotalPrice());
    }

}
