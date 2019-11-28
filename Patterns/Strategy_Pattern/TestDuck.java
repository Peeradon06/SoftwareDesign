package Chapter1;

public class TestDuck {

	public static void main(String[] args) {
		duck d1 = new RedHeadDuck();
		d1.performFly();
		d1.performQuack();
		d1.display();
		duck d2 = new MallarDuck();
		d2.display();
		d2.performFly();
		d2.performQuack();

	}

}
