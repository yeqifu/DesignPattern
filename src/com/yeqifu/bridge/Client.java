package com.yeqifu.bridge;

public class Client {
	public static void main(String[] args) {
		Phone phoneOne = new FoldedPhone(new XiaoMi());
		phoneOne.open();
		phoneOne.call();
		phoneOne.close();
		
		System.out.println("=======================================");
		
		Phone phoneTwo = new FoldedPhone(new Vivo());
		phoneTwo.open();
		phoneTwo.call();
		phoneTwo.close();
		
		System.out.println("========================================");
		
		Phone phoneThree = new FullScreenPhone(new XiaoMi());
		phoneThree.open();
		phoneThree.call();
		phoneThree.close();
		
	}
}
