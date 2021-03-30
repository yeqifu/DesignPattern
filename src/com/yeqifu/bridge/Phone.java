package com.yeqifu.bridge;

public abstract class Phone {
	//聚合手机品牌
	private Brand brand;
	public Phone(Brand brand){
		super();
		this.brand = brand;
	}
	
	protected void open(){
		this.brand.open();
	}
	
	protected void call(){
		this.brand.call();
	}
	
	protected void close(){
		this.brand.close();
	}
}
