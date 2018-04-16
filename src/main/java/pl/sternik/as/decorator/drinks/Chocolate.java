package pl.sternik.as.decorator.drinks;

public class Chocolate implements Drink {
    private static final double PRICE_DRINK = 10.50;
    private static final String NAME_DRINK = "Chocolate";

    public String getName() {
        return NAME_DRINK;
    }

    public double getPrice() {
        return PRICE_DRINK;
    }

	@Override
	public String toString() {
		return "Chocolate [name()=" + getName() + ", price=" + getPrice() + "]";
	}
    
    
}
