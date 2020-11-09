package com.yeqifu.factory.factorymethod.store;

import com.yeqifu.factory.factorymethod.entity.NYStyleCheesePizza;
import com.yeqifu.factory.factorymethod.entity.NYStyleHamPizza;
import com.yeqifu.factory.factorymethod.entity.Pizza;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=null;
		if (type.equals("hampizza")) {
			pizza = new NYStyleHamPizza();
			pizza.setName("NYStyleHamPizza");
			return pizza;
		}else if(type.equals("cheesepizza")){
			pizza = new NYStyleCheesePizza();
			pizza.setName("NYStyleCheesePizza");
			return pizza;
		}
		return null;
	}

}
