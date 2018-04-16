package pl.sternik.as.decorator.decorators;

import pl.sternik.as.decorator.drinks.Drink;

public class WhippedCream extends DrinkDecorator {
    private static final double PRICE_EXTRA = 1.20;
    private static final String DESCRIPTION_EXTRA = " with wipped cream";

    public WhippedCream(Drink drink) {
        super(drink);
        System.out.println("Adding whipped cream  (price " + PRICE_EXTRA + " zł)");
    }

    public String getName() {
        return getDrink().getName() + DESCRIPTION_EXTRA;
    }

    public double getPrice() {
        return getDrink().getPrice() + PRICE_EXTRA;
    }

    @Override
    public String toString() {
        return "ML [name()=" + getName() + ", price=" + getPrice() + "]";
    }
}
