package com.yeqifu.factory.factorymethod.entity;

public abstract class Pizza {
	private String name;
	public abstract void prepare();
	public void bark(){
		System.out.println("完成烘烤");
	}
	public void cut(){
		System.out.println("完成切割");
	}
	public void box(){
		System.out.println("完成打包");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
