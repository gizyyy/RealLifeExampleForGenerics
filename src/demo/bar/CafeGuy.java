package demo.bar;

import demo.drinks.Tee;
import demo.glasses.Cup;

public class CafeGuy implements NonAlcoholicServiceCraft {
	
	@Override
	public void makeTheService(Cup cup) {
		cup.put(new Tee());
		System.out.println("Im putting a sugar to tee");
		cup.get().consume();
	}
}
