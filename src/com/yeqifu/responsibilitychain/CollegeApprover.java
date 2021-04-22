package com.yeqifu.responsibilitychain;

public class CollegeApprover extends Approver{

	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if ( 5000<purchaseRequest.getPrice() && purchaseRequest.getPrice()<=10000 ) {
			System.out.println("该审批由院长"+this.name+"通过，编号为"+purchaseRequest.getId()+"。价格为："+purchaseRequest.getPrice());
		}else {
			// 由下一个人进行处理
			approver.processRequest(purchaseRequest);
		}
	}

}
