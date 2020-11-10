package com.yeqifu.factory.simplefactory.entity;

public class CheesePizza extends Pizza{

	public CheesePizza() {
		
	}
	
	@Override
	public void prepare() {
		System.out.println("给奶酪pizza准备原材料");
	}

}
