package com.yeqifu.principle.interfacesegregation;

public class InterfaceSegregationOne {
	public static void main(String[] args) {
		/**
		 * 不符合接口隔离原则
		 * A通过interface1依赖B，且只使用了方法1,2,3，但是B却要实现接口的所有方法
		 */
		A a = new A();
		a.depend1(new B());
		a.depend2(new B());
		a.depend3(new B());
		C c = new C();
		c.depend1(new D());
		c.depend4(new D());
		c.depend5(new D());
	}
}
interface interface1{
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}
class B implements interface1{

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

	@Override
	public void operation4() {
		System.out.println("B实现了接口1中的operation4");
	}

	@Override
	public void operation5() {
		System.out.println("B实现了接口1中的operation5");
	}
}

class D implements interface1{

	@Override
	public void operation1() {
		System.out.println("D实现了接口1中的operation1");
	}

	@Override
	public void operation2() {
		System.out.println("D实现了接口1中的operation2");
	}

	@Override
	public void operation3() {
		System.out.println("D实现了接口1中的operation3");
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

class A{
	public void depend1(B interface1){
		interface1.operation1();
	}
	public void depend2(B interface1){
		interface1.operation2();
	}
	public void depend3(B interface1){
		interface1.operation3();
	}
}

class C{
	public void depend1(D interface1){
		interface1.operation1();
	}
	public void depend4(D interface1){
		interface1.operation4();
	}
	public void depend5(D interface1){
		interface1.operation5();
	}
}