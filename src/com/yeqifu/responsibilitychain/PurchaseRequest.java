package com.yeqifu.responsibilitychain;

public class PurchaseRequest {
	// 编号
	private Integer id;
	// 类型
	private Integer type;
	// 价格
	private Float price = 0f;
	
	public PurchaseRequest(Integer id, Integer type, Float price){
		this.id = id;
		this.type = type;
		this.price = price;
	}
	
	public Integer getId(){
		return this.id;
	}

	public Integer getType() {
		return type;
	}

	public Float getPrice() {
		return price;
	}
	
	
	
}
