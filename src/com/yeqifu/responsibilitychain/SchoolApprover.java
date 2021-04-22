package com.yeqifu.responsibilitychain;

public class SchoolApprover extends Approver{

	public SchoolApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if ( 20000<purchaseRequest.getPrice()) {
			System.out.println("该审批由校长"+this.name+"通过，编号为"+purchaseRequest.getId()+"。价格为："+purchaseRequest.getPrice());
		}else {
			approver.processRequest(purchaseRequest);
		}
	}

}
