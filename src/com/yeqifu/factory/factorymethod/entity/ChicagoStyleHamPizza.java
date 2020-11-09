package com.yeqifu.factory.factorymethod.entity;

public class ChicagoStyleHamPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("芝加哥风味的HamPizza");
	}

}
