package FactoryPattern;
import java.util.*;
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepair() {
		System.out.println("Prepairing .... ");
	}
	public void bake() {
		System.out.println("Baking .... ");
	}
	public void cut() {
		System.out.println("Cutting .... ");
	}
	void box() {
		System.out.println("Boxing .... ");
	}
	public String getName(){
		return this.name;
	}
}
