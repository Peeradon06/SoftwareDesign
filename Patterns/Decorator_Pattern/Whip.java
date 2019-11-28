package Decorator;

public class Whip extends Decorator {
	Beverage beverage;
	public Whip(Beverage b) {
		this.beverage = b;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" + Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.1;
	}

}
