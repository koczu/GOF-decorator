package pl.sternik.as.decorator;

import pl.sternik.as.decorator.decorators.Milk;
import pl.sternik.as.decorator.decorators.Sugar;
import pl.sternik.as.decorator.decorators.WhippedCream;
import pl.sternik.as.decorator.drinks.Chocolate;
import pl.sternik.as.decorator.drinks.Coffe;
import pl.sternik.as.decorator.drinks.Drink;

public abstract class Cafe {

	public static void main(String[] args) {

		Drink coffe = new Coffe();
		Drink chocolate = new Chocolate();
		System.out.println(coffe);
		
		coffe = new Sugar(coffe);
		System.out.println(coffe);
	    coffe = new Sugar(coffe);
        System.out.println(coffe);
		coffe = new WhippedCream(coffe);
		System.out.println(coffe);

		chocolate  = new Sugar(chocolate);
		System.out.println(chocolate);
		chocolate = new Milk(chocolate);
		System.out.println(chocolate);
		chocolate = new WhippedCream(chocolate);
		System.out.println(chocolate);

	}

}
