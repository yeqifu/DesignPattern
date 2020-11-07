package com.yeqifu.singleton.type7;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 静态内部类
 * @author yeqifu
 *
 */
public class SingletonTest7 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}
}
class Singleton{
	//私有化构造器
	private Singleton(){
		
	}
	//声明一个静态内部类
	private static class SingletonInstance{
		//实例化一个instance
		private static final Singleton instance = new Singleton();
	}
	//获取实例的静态方法
	public static Singleton getInstance(){
		return SingletonInstance.instance;
	}
}
