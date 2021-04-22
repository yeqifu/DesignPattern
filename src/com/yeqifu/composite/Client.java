package com.yeqifu.composite;

public class Client {

	public static void main(String[] args) {
		OrganizationComponent university = new University("九江学院", "竟知向学，厚德笃行");
		
		OrganizationComponent collegeOne = new College("计算机与大数据科学学院", "打牢基础");
		OrganizationComponent collegeTwo = new College("电子学院","偏硬件");
		
		university.add(collegeOne);
		university.add(collegeTwo);
		
		university.remove(collegeOne);
		
		collegeOne.add(new Department("计算机科学与技术", "老牌专业"));
		collegeOne.add(new Department("物联网", "新兴专业"));
		
		collegeTwo.add(new Department("电路板专业", "焊电路板"));
		
		university.print();
	}
	
}
