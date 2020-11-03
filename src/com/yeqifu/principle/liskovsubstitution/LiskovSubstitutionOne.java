package com.yeqifu.principle.liskovsubstitution;

public class LiskovSubstitutionOne {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("11-3=" + a.funcOne(11, 3));//8
		System.out.println("1-8=" + a.funcOne(1, 8));//-7
		System.out.println("-----------------------");
		B b = new B();
		System.out.println("11-3=" + b.funcOne(11, 3));//14
		System.out.println("1-8=" + b.funcOne(1, 8));//9
		System.out.println("11+3+9=" + b.funcTwo(11, 3));//23
	}
}

class A {
	public int funcOne(int a, int b) {
		return a - b;
	}
}

class B extends A {
	public int funcOne(int a, int b) {
		return a + b;
	}

	public int funcTwo(int a, int b) {
		return funcOne(a, b) + 9;
	}
}