package com.yeqifu.principle.singleresponsibility;

public class SingleResponsibilityTwo {
	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("摩托车");
		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("游艇");
		SkyVehicle skyVehicle = new SkyVehicle(); 
		skyVehicle.run("飞机");
	}
}
//符合单一职责原则，但是创建的类过多
class RoadVehicle{
	public void run(String vehicle){
		System.out.println(vehicle+"在路上跑");
	}
}
class WaterVehicle{
	public void run(String vehicle){
		System.out.println(vehicle+"在水上跑");
	}
}
class SkyVehicle{
	public void run(String vehicle){
		System.out.println(vehicle+"在天上跑");
	}
}