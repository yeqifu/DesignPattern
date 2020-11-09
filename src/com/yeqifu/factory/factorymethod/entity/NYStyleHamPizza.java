package com.yeqifu.factory.factorymethod.entity;

public class NYStyleHamPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("纽约风味的HamPizza");
	}

}
