package demo.glasses;

import demo.bar.BarTender;
import demo.drinks.Margaritha;

public class MargarithaGlass extends Fillable<Margaritha, BarTender> {
	private Margaritha content;

	public void serve(BarTender barTender) {
		barTender.makeTheService(this);
	}

	@Override
	public void put(Margaritha drink) {
		this.content = drink;

	}

	@Override
	public Margaritha get() {
		return content;
	}

}
