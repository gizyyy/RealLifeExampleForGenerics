package demo.bar;

import java.util.ArrayList;
import java.util.List;

import demo.drinks.Beer;
import demo.drinks.HotBeverage;
import demo.drinks.Margaritha;
import demo.glasses.BeerGlass;
import demo.glasses.Cup;
import demo.glasses.Fillable;
import demo.glasses.MargarithaGlass;

public class Bar {
	public static void main(String args[]) {

		BarTender barTender = new BarTender();
		CafeGuy coffeeGuy = new CafeGuy();
		List<ServiceCraft> crafts = new ArrayList<ServiceCraft>();
		crafts.add(barTender);
		crafts.add(coffeeGuy);

		Fillable<Beer, BarTender> beerGlass = new BeerGlass();
		beerGlass.serve(barTender);

		Fillable<HotBeverage, CafeGuy> cup1 = new Cup();
		cup1.serve(coffeeGuy);

		Fillable<HotBeverage, CafeGuy> cup2 = new Cup();
		cup2.serve(coffeeGuy);

		Fillable<Margaritha, BarTender> margarithaGlass = new MargarithaGlass();
		margarithaGlass.serve(barTender);

	}
}
