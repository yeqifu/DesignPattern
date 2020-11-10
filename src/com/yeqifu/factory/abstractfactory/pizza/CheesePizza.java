package com.yeqifu.factory.abstractfactory.pizza;

import com.yeqifu.factory.abstractfactory.ingredient.Cheese;
import com.yeqifu.factory.abstractfactory.ingredient.Dough;
import com.yeqifu.factory.abstractfactory.ingredient.Sauce;
import com.yeqifu.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing"+name);
		Dough dough = ingredientFactory.createDough();
		Sauce createSauce = ingredientFactory.createSauce();
		Cheese createCheese = ingredientFactory.createCheese();
	}

}
