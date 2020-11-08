package com.yeqifu.factory.simplefactory.entity;

public class HamPizza extends Pizza{

	public HamPizza() {
		
	}
	
	@Override
	public void prepare() {
		System.out.println("给火腿pizza准备原材料");
	}

}
