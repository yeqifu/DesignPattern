package com.yeqifu.factory.abstractfactory.store;

import com.yeqifu.factory.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(String pizzaType);
}
