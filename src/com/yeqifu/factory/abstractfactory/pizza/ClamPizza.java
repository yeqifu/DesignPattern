package com.yeqifu.factory.abstractfactory.pizza;

import com.yeqifu.factory.abstractfactory.ingredient.Cheese;
import com.yeqifu.factory.abstractfactory.ingredient.Clams;
import com.yeqifu.factory.abstractfactory.ingredient.Dough;
import com.yeqifu.factory.abstractfactory.ingredient.Sauce;
import com.yeqifu.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing"+name);
		Dough createDough = ingredientFactory.createDough();
		Sauce createSauce = ingredientFactory.createSauce();
		Cheese createCheese = ingredientFactory.createCheese();
		Clams createClam = ingredientFactory.createClam();
		
	}

}
