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
        Money price = new Money(new Currency("dollars", "$"), 4.50);
        Coffee drink = new Coffee("Covfefe", new Size("Large"), price);
        receipt.add(drink);

        Money price2 = new Money(new Currency("dollars", "$"), 2.70);
        Coffee drink2 = new Coffee("Java", new Size("Medium"), price2);
        receipt.add(drink2);
        
        Money price3 = new Money(new Currency("dollars", "$"), 4.20);
        Coffee drink3 = new Coffee("Cappuccino", new Size("Venti"), price3);
        receipt.add(drink3);
        
        Money price4 = new Money(new Currency("dollars", "$"), 6.90);
        Coffee drink4 = new Coffee("Americano", new Size("Extra Large"), price4);
        receipt.add(drink4);
        
        Money price5 = new Money(new Currency("dollars", "$"), 10.30);
        Coffee drink5 = new Coffee("Black Coffee", new Size("Small"), price5);
        receipt.add(drink5);
        
        System.out.println(receipt.prepare());
    }

}
