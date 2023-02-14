/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaStoreFactory;


public class Main {
    public static void main(String [] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        
        Pizza pizza1 = store.orderPizza("cheese");
	System.out.println(pizza1);
        /*
        Pizza pizza2 = store.orderPizza("veggie");
	System.out.println(pizza2);
        
        Pizza pizza3 = store.orderPizza("clam");
	System.out.println(pizza3);
        
        Pizza pizza4 = store.orderPizza("pepperoni");
	System.out.println(pizza4);
         */
    }
}
