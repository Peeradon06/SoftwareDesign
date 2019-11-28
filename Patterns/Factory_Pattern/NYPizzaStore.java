package FactoryPattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String name) {
		Pizza pizza = null;
		if(name=="Cheese") {
			return pizza = new CheesePizza();
		}else {
			return pizza;
		}
	}
}
