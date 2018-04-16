package pl.sternik.as.decorator.decorators;
import pl.sternik.as.decorator.drinks.Drink;

public enum ExtraTypes {
    Sugar {
        @Override
        public Drink add(Drink drink) {
            return new Sugar(drink);
        }

    },
    Milk {
        @Override
        public Drink add(Drink drink) {
            return new Milk(drink);
        }

    },
    WhippedCream {
        @Override
        public Drink add(Drink drink) {
            return new WhippedCream(drink);
        }
    };

    public abstract Drink add(Drink drink);
}

