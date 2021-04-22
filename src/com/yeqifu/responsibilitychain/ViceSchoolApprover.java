package com.yeqifu.responsibilitychain;

public class ViceSchoolApprover extends Approver{

	public ViceSchoolApprover(String name){
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if ( 10000<purchaseRequest.getPrice() && purchaseRequest.getPrice()<=20000 ) {
			System.out.println("该审批由副校长"+this.name+"通过，编号为"+purchaseRequest.getId()+"。价格为："+purchaseRequest.getPrice());
		}else {
			// 由下一个人进行处理
			approver.processRequest(purchaseRequest);
		}
		
	}
	
	
}
