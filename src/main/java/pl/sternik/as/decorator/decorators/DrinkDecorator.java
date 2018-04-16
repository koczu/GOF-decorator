package pl.sternik.as.decorator.decorators;

import pl.sternik.as.decorator.drinks.Drink;

public abstract class DrinkDecorator implements Drink {
    
	private final Drink drink;

    public DrinkDecorator(Drink drink) {
        super();
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }
}
