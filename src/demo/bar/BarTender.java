package demo.bar;

import demo.drinks.Beer;
import demo.drinks.Margaritha;
import demo.glasses.BeerGlass;
import demo.glasses.MargarithaGlass;

public class BarTender implements AlcoholicServiceCraft {

	public void makeTheService(BeerGlass beerGlass) {
		beerGlass.put(new Beer());
		System.out.println("Im bringing popcorn as promotion next to beer");
		beerGlass.get().consume();
	}

	public void makeTheService(MargarithaGlass margarithaGlass) {
		margarithaGlass.put(new Margaritha());
		System.out.println("Im putting a lemon");
		margarithaGlass.get().consume();
	}

}
