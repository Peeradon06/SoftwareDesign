package FactoryPattern;

public class Runtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore ny = new NYPizzaStore();
		Pizza pizza = ny.order("Cheese");
		System.out.print("My order is a "+pizza.getName());
		
	}

}
