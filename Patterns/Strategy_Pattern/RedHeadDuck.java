package Chapter1;

public class RedHeadDuck extends duck {
	
	public RedHeadDuck() {
		flybehavior = new FlyNoWay();
		quackbehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("I'm RedHeadDuck!!!");
	}

}
