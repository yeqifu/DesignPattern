package com.yeqifu.factory.simplefactory;

import com.yeqifu.factory.simplefactory.entity.CheesePizza;
import com.yeqifu.factory.simplefactory.entity.HamPizza;
import com.yeqifu.factory.simplefactory.entity.Pizza;

public class SimpleFactory {
	private static Pizza pizza;
	public static Pizza createPizza(String pizzaType){
		
		if (pizzaType.equals("hampizza")) {
			pizza = new HamPizza();
			pizza.setName("HamPizza");
			return pizza;
		}else if(pizzaType.equals("cheesepizza")){
			pizza = new CheesePizza();
			pizza.setName("CheesePizza");
			return pizza;
		}else {
			return null;
		}
	}
}
