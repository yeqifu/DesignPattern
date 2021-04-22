package com.yeqifu.composite;

public abstract class OrganizationComponent {
	//名字
	private String name;
	//描述
	private String description;
	
	public OrganizationComponent(String name,String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// 添加方法
	protected void add(OrganizationComponent  organizationComponent){
		// 默认实现
		throw new UnsupportedOperationException();
	}
	
	// 删除方法
	protected void remove(OrganizationComponent organizationComponent){
		// 默认实现
		throw new UnsupportedOperationException();
	}
	
	public abstract void print();
	
}
