package com.yeqifu.factory.factorymethod.store;

import com.yeqifu.factory.factorymethod.entity.ChicagoStyleCheesePizza;
import com.yeqifu.factory.factorymethod.entity.ChicagoStyleHamPizza;
import com.yeqifu.factory.factorymethod.entity.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("hampizza")) {
			pizza = new ChicagoStyleHamPizza();
			pizza.setName("ChicagoHamPizza");
		}else if(type.equals("cheesepizza")){
			pizza = new ChicagoStyleCheesePizza();
			pizza.setName("ChicagoCheesePizza");
		}
		return null;
	}

}
