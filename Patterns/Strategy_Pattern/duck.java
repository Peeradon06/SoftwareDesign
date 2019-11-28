package Chapter1;

public abstract class duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	public void performFly() {
		flybehavior.fly();
	}
	public void performQuack() {
		quackbehavior.quack();
	}
	public abstract void display();
	
}
