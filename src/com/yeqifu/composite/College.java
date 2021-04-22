package com.yeqifu.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	public College(String name, String description) {
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
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}
	
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}
	
	@Override
	public void print() {
		System.out.println("-----------------"+getName()+"-------------------------");
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}

}
