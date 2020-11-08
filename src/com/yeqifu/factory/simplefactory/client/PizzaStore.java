package com.yeqifu.factory.simplefactory.client;

import com.yeqifu.factory.simplefactory.SimpleFactory;
import com.yeqifu.factory.simplefactory.order.OrderPizza;

public class PizzaStore {
	public static void main(String[] args) {
		new OrderPizza(new SimpleFactory());
		
	}
}
