package pl.sternik.as.decorator.express;

import pl.sternik.as.decorator.decorators.Milk;
import pl.sternik.as.decorator.drinks.Coffe;
import pl.sternik.as.decorator.drinks.Drink;

public class ExpressCoffe extends Express {
    private final Drink coffe = new Coffe();

    @Override
    protected Drink createDrink() {
        System.out.println("Creating drink - Chocolate (price " + coffe.getPrice() + " zł)");
        return coffe;
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
        return new Milk(drink);
    }
}