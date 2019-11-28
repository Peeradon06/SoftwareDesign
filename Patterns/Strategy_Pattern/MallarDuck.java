package Chapter1;

public class MallarDuck extends duck {
	public MallarDuck() {
		this.flybehavior = new FlyWithWings();
		this.quackbehavior = new Quack();
	}
	public void display() {
		System.out.println("MallarDuck!!");
	}
}
