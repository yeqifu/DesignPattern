package com.yeqifu.factory.simplefactory.order;

import java.io.InputStream;
import java.util.Scanner;

import com.yeqifu.factory.simplefactory.SimpleFactory;
import com.yeqifu.factory.simplefactory.entity.Pizza;

public class OrderPizza {
	private Pizza pizza;
	private SimpleFactory simpleFactory;
	public OrderPizza(SimpleFactory simpleFactory){
		setSimpleFactory(simpleFactory);
	}
	public void setSimpleFactory(SimpleFactory simpleFactory){
		String pizzaType = getPizzaType();
		Pizza pizza = simpleFactory.createPizza(pizzaType);
		if (pizza!=null) {
			pizza.prepare();
			pizza.bark();
			pizza.cut();
			pizza.box();
		}else {
			System.out.println("您的输入有误，没有此pizza");
		}
	}
	public String getPizzaType(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要制作的pizza（字母请小写）");
		String next = scanner.next();
		return next;
	}
}
