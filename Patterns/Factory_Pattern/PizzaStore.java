package FactoryPattern;

public abstract class PizzaStore {
	SimpleFactory factory;
	
	
	public Pizza order(String n) {
		Pizza pizza;
		//pizza = factory.createPizza(n);
		pizza = createPizza(n);
		pizza.prepair();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	public abstract Pizza createPizza(String name);
}
