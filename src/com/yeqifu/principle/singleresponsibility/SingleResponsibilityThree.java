package com.yeqifu.principle.singleresponsibility;

public class SingleResponsibilityThree {
	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.roadVehicle("汽车");
		vehicle2.waterVehicle("游艇");
		vehicle2.skyVehicle("飞机");
	}
}
//1.这种修改方法没有对原来的类做大的修改，只是增加方法
//2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
class Vehicle2{
	public void roadVehicle(String vehicle){
		System.out.println(vehicle+"在路上跑");
	}
	public void waterVehicle(String vehicle){
		System.out.println(vehicle+"在水上跑");
	}
	public void skyVehicle(String vehicle){
		System.out.println(vehicle+"在天上跑");
	}
}