package com.yeqifu.factory.factorymethod.store;

import com.yeqifu.factory.factorymethod.entity.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		if (pizza!=null) {
			System.out.println("使用工厂方法模式完成pizza的制作！");
			pizza.prepare();
			pizza.bark(); 
			pizza.cut();
			pizza.box();
			return pizza;
		}else {
			System.out.println("您输入的Pizza类型有误！");
			return null;
		}
	}
	//定义创建Pizza对象的接口
	protected abstract Pizza createPizza(String type);
}
