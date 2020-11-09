package com.yeqifu.factory.factorymethod.entity;

public class NYStyleCheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("纽约风味的CheesePizza");
	}

}
