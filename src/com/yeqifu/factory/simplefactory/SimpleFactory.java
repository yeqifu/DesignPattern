package com.yeqifu.factory.simplefactory;

import com.yeqifu.factory.simplefactory.entity.CheesePizza;
import com.yeqifu.factory.simplefactory.entity.HamPizza;
import com.yeqifu.factory.simplefactory.entity.Pizza;

/**
 * 简单工厂
 * 当需要增加一个pizza的类型的时候，只需在此类修改即可
 * @author yeqifu
 *
 */
public class SimpleFactory {
	private static Pizza pizza;
	public static Pizza createPizza(String pizzaType){
		System.out.println("使用简单工厂模式");
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
