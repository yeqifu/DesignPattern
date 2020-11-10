package com.yeqifu.factory.abstractfactory;

import java.util.Scanner;

import com.yeqifu.factory.abstractfactory.pizza.Pizza;
import com.yeqifu.factory.abstractfactory.store.NYPizzaStore;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.createPizza(getType());
		if (pizza!=null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}else {
			System.out.println("您的输出类型有误！");
		}
	}
	public static String getType(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入Pizza的类型（字母全部小写）：");
		String pizzaType = scanner.next();
		return pizzaType;
	}
}
