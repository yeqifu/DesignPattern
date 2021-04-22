package com.yeqifu.composite;

public class Department extends OrganizationComponent{

	public Department(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	@Override
	public void print() {
		System.out.println(getName()+"---------"+getDescription());
	}

}
