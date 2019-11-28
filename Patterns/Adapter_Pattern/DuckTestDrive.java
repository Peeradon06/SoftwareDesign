import java.util.ArrayList;
import java.util.List;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says....");
		testDuck(duck);
		
		System.out.println("\nThe turkey says....");
		testDuck(turkeyAdapter);
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new MallardDuck());
		ducks.add(new TurkeyAdapter(new WildTurkey()));
		ducks.add(new MallardDuck());
		for(Duck d : ducks) {
			
		}
	}
	static void testDuck(Duck duck)  {
		duck.quack();
		duck.fly();
	}

}
