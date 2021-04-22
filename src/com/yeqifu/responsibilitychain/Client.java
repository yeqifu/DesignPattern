package com.yeqifu.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		// 创建审批请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 0, 1000f);
		
		// 创建各个类型的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张三年级主任");
		CollegeApprover collegeApprover = new CollegeApprover("李四院长");
		ViceSchoolApprover viceSchoolApprover = new ViceSchoolApprover("王五副校长");
		SchoolApprover schoolApprover = new SchoolApprover("陈六校长");
		
		// 设置各个类型的审批人的下一个审批人(要将处理人形成一个环路)
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolApprover);
		viceSchoolApprover.setApprover(schoolApprover);
		schoolApprover.setApprover(departmentApprover);
		
		
		viceSchoolApprover.processRequest(purchaseRequest);
	}
	
	
}
