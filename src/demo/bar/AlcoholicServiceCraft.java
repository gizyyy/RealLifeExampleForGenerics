package demo.bar;

import demo.glasses.BeerGlass;
import demo.glasses.MargarithaGlass;

public interface AlcoholicServiceCraft extends ServiceCraft {

	public void makeTheService(BeerGlass beerGlass);

	public void makeTheService(MargarithaGlass beerGlass);
}
