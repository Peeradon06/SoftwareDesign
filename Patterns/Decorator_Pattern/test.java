package Decorator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b1 = new Decaf();
		System.out.println(b1.getDescription()+" Total is "+b1.cost());
		Beverage b2 = new HouseBlend();
		System.out.println(b2.getDescription()+" Total is "+b2.cost());
		Beverage b3 = new Whip(b1);
		System.out.println(b3.getDescription()+" Total is "+b3.cost());
		Beverage b4 = new Milk(b3);
		System.out.println(b4.getDescription()+" Total is "+b4.cost());

	}

}
