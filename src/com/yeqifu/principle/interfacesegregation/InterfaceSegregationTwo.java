package com.yeqifu.principle.interfacesegregation;

public class InterfaceSegregationTwo {
	public static void main(String[] args) {
		/**
		 * 符合接口隔离原则
		 * A通过interface1依赖B，且只使用了方法1,2,3，但是B却要实现接口的所有方法
		 */
		AI a = new AI();
		//A类通过接口去依赖B类
		a.depend1(new BI());
		a.depend2(new BI());
		a.depend3(new BI());
		CI c = new CI();
		//C类通过接口去依赖D类
		c.depend1(new DI());
		c.depend4(new DI());
		c.depend5(new DI());
	}
}
interface interfaceOne{
	void operation1();
}
interface interfaceTwo{
	void operation2();
	void operation3();
}
interface interfaceThree{
	void operation4();
	void operation5();
}
class BI implements interfaceOne,interfaceTwo{
	@Override
	public void operation1() {
		System.out.println("B实现了接口1中的operation1");
	}

	@Override
	public void operation2() {
		System.out.println("B实现了接口1中的operation2");
	}

	@Override
	public void operation3() {
		System.out.println("B实现了接口1中的operation3");
	}
}

class DI implements interfaceOne,interfaceThree{
	@Override
	public void operation1() {
		System.out.println("D实现了接口1中的operation1");
	}

	@Override
	public void operation4() {
		System.out.println("D实现了接口1中的operation4");
	}

	@Override
	public void operation5() {
		System.out.println("D实现了接口1中的operation5");
	}
}

class AI{
	public void depend1(BI interface1){
		interface1.operation1();
	}
	public void depend2(BI interface1){
		interface1.operation2();
	}
	public void depend3(BI interface1){
		interface1.operation3();
	}
}

class CI{
	public void depend1(DI interface1){
		interface1.operation1();
	}
	public void depend4(DI interface1){
		interface1.operation4();
	}
	public void depend5(DI interface1){
		interface1.operation5();
	}
}