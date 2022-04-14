package demo.glasses;

import demo.bar.BarTender;
import demo.drinks.Beer;

public class BeerGlass extends Fillable<Beer, BarTender> {

	private Beer content;

	public void serve(BarTender barTender) {
		barTender.makeTheService(this);
	}

	@Override
	public void put(Beer drink) {
		this.content = drink;
	}

	@Override
	public Beer get() {
		return content;
	}
}
