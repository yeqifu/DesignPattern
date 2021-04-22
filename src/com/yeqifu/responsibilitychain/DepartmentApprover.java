package com.yeqifu.responsibilitychain;

public class DepartmentApprover extends Approver{

	public DepartmentApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() <= 5000 ) {
			System.out.println("该审批由教学主任"+this.name+"通过，编号为"+purchaseRequest.getId()+"。价格为："+purchaseRequest.getPrice());
		}else {
			// 由下一个人进行处理
			approver.processRequest(purchaseRequest);
		}
	}
	
}
