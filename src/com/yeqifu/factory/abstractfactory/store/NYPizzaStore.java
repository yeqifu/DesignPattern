package com.yeqifu.factory.abstractfactory.store;

import com.yeqifu.factory.abstractfactory.ingredientfactory.NYPizzaIngredientFactory;
import com.yeqifu.factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import com.yeqifu.factory.abstractfactory.pizza.Pizza;
import com.yeqifu.factory.abstractfactory.pizza.CheesePizza;
import com.yeqifu.factory.abstractfactory.pizza.ClamPizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (pizzaType.equals("cheesepizza")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if (pizzaType.equals("clampizza")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		return pizza;
	}

}
