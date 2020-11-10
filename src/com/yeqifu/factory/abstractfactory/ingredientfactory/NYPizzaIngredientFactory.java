package com.yeqifu.factory.abstractfactory.ingredientfactory;

import com.yeqifu.factory.abstractfactory.ingredient.Cheese;
import com.yeqifu.factory.abstractfactory.ingredient.Clams;
import com.yeqifu.factory.abstractfactory.ingredient.Dough;
import com.yeqifu.factory.abstractfactory.ingredient.Pepperoni;
import com.yeqifu.factory.abstractfactory.ingredient.Sauce;
import com.yeqifu.factory.abstractfactory.ingredient.Veggies;
import com.yeqifu.factory.abstractfactory.nyingredient.FreshClams;
import com.yeqifu.factory.abstractfactory.nyingredient.Garlic;
import com.yeqifu.factory.abstractfactory.nyingredient.MarinaraSauce;
import com.yeqifu.factory.abstractfactory.nyingredient.Onion;
import com.yeqifu.factory.abstractfactory.nyingredient.RedPepper;
import com.yeqifu.factory.abstractfactory.nyingredient.ReggianoCheese;
import com.yeqifu.factory.abstractfactory.nyingredient.SlicedPepperoni;
import com.yeqifu.factory.abstractfactory.nyingredient.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(),new Onion(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
