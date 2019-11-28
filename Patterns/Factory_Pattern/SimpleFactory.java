package FactoryPattern;

public class SimpleFactory {
	public Pizza createPizza(String n) {
		Pizza pizza = null;
		if(n=="Cheese") {
			return pizza = new CheesePizza();
		}
		return pizza;
	}
}
