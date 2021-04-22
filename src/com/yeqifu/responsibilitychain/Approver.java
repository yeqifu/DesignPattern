package com.yeqifu.responsibilitychain;

public abstract class Approver {
	// 姓名
	protected String name;
	// 下一个处理者
	protected Approver approver;
	
	public Approver(String name){
		this.name = name;
	}
	
	public void setApprover(Approver approver){
		this.approver = approver;
	}
	
	// 处理审批请求的方法，得到一个请求，然后由子类去完成
	public abstract void processRequest(PurchaseRequest purchaseRequest);
	
}
