package com.yeqifu.bridge;

public class FullScreenPhone extends Phone{
	public FullScreenPhone(Brand brand) {
		super(brand);
	}

	public void open(){
		super.open();
		System.out.println("全面屏手机开机");
	}
	
	public void call(){
		super.call();
		System.out.println("全面屏手机打电话");
	}
	
	public void close(){
		super.close();
		System.out.println("全面屏手机关机");
	}
}
