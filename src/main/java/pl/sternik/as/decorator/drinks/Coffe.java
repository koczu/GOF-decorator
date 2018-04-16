package pl.sternik.as.decorator.drinks;

public class Coffe implements Drink {
    private static final double PRICE_DRINK = 6.50;
    private static final String NAME_DRINK = "Coffe";

    public String getName() {
        return NAME_DRINK;
    }

    public double getPrice() {
        return PRICE_DRINK;
    }

	@Override
	public String toString() {
		return "Coffe [name()=" + getName() + ", price=" + getPrice() + "]";
	}
    
    
}
