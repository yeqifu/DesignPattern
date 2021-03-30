package com.yeqifu.bridge;

public class FoldedPhone extends Phone{

	public FoldedPhone(Brand brand) {
		super(brand);
	}

	public void open(){
		super.open();
		System.out.println("折叠屏手机开机");
	}
	
	public void call(){
		super.call();
		System.out.println("折叠屏手机打电话");
	}
	
	public void close(){
		super.close();
		System.out.println("折叠屏手机关机");
	}
}
