package com.yeqifu.principle.singleresponsibility;

/**
 * 设计模式需要遵循的原则：
 * 单一职责原则
 * 接口隔离原则
 * 依赖倒转原则
 * 里氏替换原则
 * 开闭原则
 * 迪米特法则
 * 合并复用原则
 * @author yeqifu
 *
 */
public class SingleResponsibilityOne {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}

}
//不符合单一接口原则
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在路上跑");
	}
}