package pl.sternik.as.decorator.express;

import pl.sternik.as.decorator.drinks.Drink;

public abstract class Express {

    public final Drink getDrink() {
        Drink drink;
        boilLiquid();
        drink = createDrink();
        drink = addExtras(drink);
        pourToMug();
        return drink;
    }
    protected abstract void boilLiquid();

    protected abstract Drink createDrink();

    protected abstract Drink addExtras(Drink drink);

    protected abstract void pourToMug();

}

