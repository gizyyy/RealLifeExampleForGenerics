package demo.glasses;

import demo.bar.CafeGuy;
import demo.drinks.HotBeverage;

public class Cup extends Fillable<HotBeverage, CafeGuy> {

	private HotBeverage content;

	public void serve(CafeGuy cafeGuy) {
		cafeGuy.makeTheService(this);
	}

	@Override
	public void put(HotBeverage drink) {
		this.content = drink;
	}

	@Override
	public HotBeverage get() {
		return content;
	}

}
