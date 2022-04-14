package demo.glasses;

import demo.bar.ServiceCraft;
import demo.drinks.Drink;

public abstract class Fillable<T extends Drink, K extends ServiceCraft> {

	
	public abstract void put(T drink);

	public abstract T get();

	public abstract void serve(K craft);
	
}
