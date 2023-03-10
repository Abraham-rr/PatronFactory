
package PizzaStoreFactory;


public class SimplePizzaFactory extends Pizza {
    
	public Pizza createPizza(String type) {
		Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                break;
        }
		return pizza;
	}
}
