package com.yeqifu.factory.factorymethod.client;

import java.util.Scanner;
import com.yeqifu.factory.factorymethod.store.NYPizzaStore;
import com.yeqifu.factory.factorymethod.store.PizzaStore;

public class NYPizzaStoreTest {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza(getType());
		
	}
	public static String getType(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入Pizza的类型：");
		String pizzaType = scanner.next();
		return pizzaType;
	}
}
