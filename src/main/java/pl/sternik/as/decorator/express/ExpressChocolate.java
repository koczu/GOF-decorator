package pl.sternik.as.decorator.express;

import pl.sternik.as.decorator.decorators.WhippedCream;
import pl.sternik.as.decorator.drinks.Drink;
import pl.sternik.as.decorator.drinks.Chocolate;

public class ExpressChocolate extends Express {
    private final Drink chocolate = new Chocolate();

    @Override
    protected Drink createDrink() {
        System.out.println("Creating drink - Chocolate (price " + chocolate.getPrice() + " zł)");
        return chocolate;
    }

    @Override
    protected void pourToMug() {
        System.out.println("Pouring to mug");
    }

    @Override
    protected void boilLiquid() {
        System.out.println("Boiling water");
    }

    @Override
    protected Drink addExtras(Drink drink) {
        return new WhippedCream(drink);
    }
}